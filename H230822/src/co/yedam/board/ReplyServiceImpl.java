package co.yedam.board;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ReplyServiceImpl implements ReplyService {

	List<Reply> rpList = new ArrayList<>();

	ReplyServiceImpl() {
		init();
	}

	private void init() {
		try {
			FileInputStream fis = new FileInputStream("C:/Temp/reply.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			rpList = (List<Reply>) ois.readObject();

			ois.close();
			fis.close();

		} catch (Exception e) {
//			e.printStackTrace();
		}
	}

	private int getMaxNo() {
		int replyNo = 0;
		for (int i = 0; i < rpList.size(); i++) {
			if (rpList.get(i).getReplyNo() > replyNo) {
				replyNo = rpList.get(i).getReplyNo();
			}
		}
		return replyNo + 1;
	}

	@Override
	public boolean add(Reply reply) {
		reply.setReplyNo(getMaxNo());
		return rpList.add(reply);
	}

	@Override
	public List<Reply> list(int list) {
		return null;
	}

	@Override
	public int getTotal() {
		return 0;
	}

	@Override
	public boolean remove(int replyNo) {
		for (int i = 0; i < rpList.size(); i++) {
			if (rpList.get(i).getReplyNo() == replyNo) {
				rpList.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Temp/reply.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(rpList);
			oos.flush();
			oos.close();
			fos.flush();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
