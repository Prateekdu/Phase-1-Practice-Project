package com;
import java.util.Arrays;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
@Entity
public class Question {
	@Id
	private  int qid;
	private String question;
	@ElementCollection
	@OrderColumn(name="answerId")
	@CollectionTable(name="anser")  // need one table answer
	private String answer[];
	private String correcrAnswer;

	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getAnswer() {
		return answer;
	}
	public void setAnswer(String[] answer) {
		this.answer = answer;
	}
	public String getCorrecrAnswer() {
		return correcrAnswer;
	}
	public void setCorrecrAnswer(String correcrAnswer) {
		this.correcrAnswer = correcrAnswer;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", answer=" + Arrays.toString(answer)
				+ ", correcrAnswer=" + correcrAnswer + "]";
	}
	
}
