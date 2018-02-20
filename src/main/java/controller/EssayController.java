package controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.EssayService;
import domain.essay.Essay;
import dto.eassy.EssayDeleteInput;
import dto.eassy.EssayDetails;
import dto.eassy.SearchEassyCondition;
/**
 * 用于攻略相关的控制器
 * @author 学徒
 *
 */
@Controller
@RequestMapping("/essay")
public class EssayController
{
	@Autowired
	private EssayService essayService;//文章相关的服务类对象
	
	
	@RequestMapping("/show")
	@ResponseBody
	public Map<String,Object> showIndexEssay(@RequestBody SearchEassyCondition condition)
	{
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("pageNumber", essayService.getPageNumber(condition));
		condition.setStart();
		result.put("content",essayService.getEssayContentList(condition));
		return result;
	}
	
	//用于获取文章的相关细节的JSON数据
	@RequestMapping("/getEssayDetails")
	@ResponseBody
	public EssayDetails  getEssayDetailsByEssayID(@RequestBody int essayID)
	{
		return essayService.getEssayDetailsByEssayID(essayID);
	}

	@RequestMapping("/update")
	@ResponseBody
	public Map<String,Object> userUpdateEssay(@RequestBody Essay essay)
	{
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("essayUpdateResult", essayService.updateEssay(essay));
		return result;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public Map<String,Boolean> deleteEssayByUser(@RequestBody EssayDeleteInput input)
	{
		Map<String,Boolean> result=new HashMap<String,Boolean>();
		result.put("essayDeleteResult",essayService.deleteEssayByUser(input)&&essayService.deleteEssayCommentByUser(input));
		return result;
	}
	
	
}
