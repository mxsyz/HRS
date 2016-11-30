package PromotionBLServiceImpl;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.List;

import PO.PromotionPO;
import VO.WebPromotionVO;
import dataService.DataFactoryService;
import dataService.PromotionDataService;
import rmi.RemoteHelper;

public class SearchWebPromotion {
	private DataFactoryService df;
	private PromotionDataService pds;
	private List<WebPromotionVO> voList;
	
	private static SearchWebPromotion searchWebPromotion;
	
	private SearchWebPromotion() {
		df=RemoteHelper.getInstance().getDataFactoryService();
		try {
			pds = (PromotionDataService)df.getDataService("Promotion");
			List<PromotionPO> poList = pds.getAllWebPromotion();
			for(PromotionPO po : poList) {
				WebPromotionVO tempvo = new WebPromotionVO(po);
				voList.add(tempvo);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static SearchWebPromotion getSearchWebPromotionInstance() {
		if(searchWebPromotion== null) {
			searchWebPromotion = new SearchWebPromotion();
		}
		return searchWebPromotion;
	}
	
	public WebPromotionVO getWebPromotion(Calendar time,String city,String bussinesscircle,int grade) {
		WebPromotionVO  wpvo=new WebPromotionVO();
		for(WebPromotionVO vo : voList) {
		if(searchWebPromotion.judgeTime(vo,time)&&searchWebPromotion.judgeCity(vo,city) &&searchWebPromotion.judgeBussinessCircle(vo,bussinesscircle) &&searchWebPromotion.judgeMemberGrade(vo,grade)) {				
			    wpvo=vo;
				break;
			}
		}
		return wpvo;
	}
	private boolean judgeTime(WebPromotionVO vo,Calendar time) {
		boolean outcome = false;
	if(time.compareTo(vo.promotionBegintime)>=0&&time.compareTo(vo.promotionEndtime)<=0) {
			outcome = true;
		}
		return outcome;
		
	}
	private boolean judgeCity(WebPromotionVO vo, String city) {
		boolean outcome = false;
		if(vo.applyCity ==city) {
			outcome = true;
		}
		return outcome;
	}
	private boolean judgeBussinessCircle(WebPromotionVO vo, String bussinesscircle) {
		boolean outcome = false;
		if(vo.applyBussinesscircle==bussinesscircle) {
			outcome = true;
		}
		return outcome;
	}
	private boolean judgeMemberGrade(WebPromotionVO vo,int grade) {
		boolean outcome = false;
		if(vo.applyMemberGrade<=grade) {
			outcome = true;
		}
		return outcome;
	}
	public WebPromotionVO getWebPromotionByPromotionNumber(String promotionnumber) {
		WebPromotionVO  wpvo=new WebPromotionVO();
		for(WebPromotionVO vo : voList) {
		if(searchWebPromotion.judgePromotionNumber(vo,promotionnumber)) {				
			    wpvo=vo;
				break;
			}
		}
		return wpvo;
	}
	private boolean judgePromotionNumber(WebPromotionVO vo,String promotionnumber) {
		boolean outcome = false;
		if(vo.promotionNumber==promotionnumber) {
			outcome = true;
		}
		return outcome;
	}
	public List<WebPromotionVO> getAllWebPromotion(){
		return voList;
	}
}