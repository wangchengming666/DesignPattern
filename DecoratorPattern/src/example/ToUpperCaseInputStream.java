package example;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ToUpperCaseInputStream extends FilterInputStream {

	InputStream inputStream;

	protected ToUpperCaseInputStream(InputStream in) {
		super(in);
		this.inputStream = in;
	}

	/**
	 * 读取单个字节
	 * 
	 * @return
	 * @throws IOException
	 */
	@Override
	public int read() throws IOException {
		// 获取父类读取的结果
		int result = super.read();
		// 如果读取到字符a,就抛出异常
		if (result == 'a') {
			throw new ToUpperException();
		}
		// 如果等于-1,说明无内容
		// 否则,将字节转成char,再将char转换成大写的后返回
		// 返回值类型是int类型,这里返回一个字符会被自动转型
		return (result == -1 ? result : Character.toUpperCase(Character.toChars(result)[0]));
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i = off; i < off + result; i++) {
			// 将字节转成大写字符后再转成字节
			b[i] = (byte) Character.toUpperCase((char) b[i]);
		}
		return result;
	}

	/***
	 * 这里是一个内部类,自定义异常
	 */
	class ToUpperException extends IOException {
		@Override
		public void printStackTrace() {
			System.out.println("不好意思我遇到异常了,向上转型失败啦");
		}
	}
}
