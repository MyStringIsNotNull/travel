package dto.answer;

import java.util.Date;

/**
 * 评论查找结果的相关对象
 * @author 学徒
 *
 */
public class ShowAnswerResult
{
	private String answerPersonPictureURL;//用户的头像的URL
	private String answerName;//用户的昵称
	private String answerContext;//回答的内容
	private String answertime;//回答的时间
	private int commentID;//回答的ID
	public int getCommentID()
	{
		return commentID;
	}
	public void setCommentID(int commentID)
	{
		this.commentID = commentID;
	}
	public String getAnswerPersonPictureURL()
	{
		return answerPersonPictureURL;
	}
	public void setAnswerPersonPictureURL(String answerPersonPictureURL)
	{
		this.answerPersonPictureURL = answerPersonPictureURL;
	}
	public String getAnswerName()
	{
		return answerName;
	}
	public void setAnswerName(String answerName)
	{
		this.answerName = answerName;
	}
	public String getAnswerContext()
	{
		return answerContext;
	}
	public void setAnswerContext(String answerContext)
	{
		this.answerContext = answerContext;
	}
	public String getAnswertime()
	{
		return answertime;
	}
	public void setAnswertime(String answertime)
	{
		this.answertime = answertime;
	}
}
