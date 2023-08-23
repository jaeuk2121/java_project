package co.yedam.reply;

import java.util.List;

public interface ReplyService {
//댓글등록
	public boolean add(Reply reply);
	//댓글목록
	public List<Reply> list(int list);
	public int getTotal();
	//댓글삭제
	public boolean remove(int replyNo);
	//종료
	public void save();
	
}
