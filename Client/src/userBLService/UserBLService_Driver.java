package userBLService;
import java.rmi.RemoteException;
import VO.*;
import common.*;
import userBLService.UserBLService;
public class UserBLService_Driver {
	public void drive(UserBLService userBLService) throws RemoteException{
		ResultMessage result1=userBLService.findByID("12");
		if(result1 ==ResultMessage.Exist) System.out.println("findByID success");
		ResultMessage result2=userBLService.update(new UserVO("1","1@nju.edu.cn","3414141","1",false,1,78,"普通会员",1,"1981/2/2",""));
		if(result2 ==ResultMessage.Exist) System.out.println("update success");
		ResultMessage result3=userBLService.add(new UserVO("1","1@nju.edu.cn","3414141","1",false,1,78,"普通会员",1,"1981/2/2",""));
		if(result3 ==ResultMessage.Exist) System.out.println("add success");
		ResultMessage result4=userBLService.delete(new UserVO("1","1@nju.edu.cn","3414141","1",false,1,78,"普通会员",1,"1981/2/2",""));
		if(result4 ==ResultMessage.Exist) System.out.println("delete success");
		long result5=userBLService.showCredit("12");
		if(result5 ==200) System.out.println("showCredit success");
		ResultMessage result6=userBLService.updateCredit(new UserVO("1","1@nju.edu.cn","3414141","1",false,1,78,"普通会员",1,"1981/2/2",""),200);
		if(result6 ==ResultMessage.Exist) System.out.println("updateCredit success");
		ResultMessage result7=userBLService.updateLevel(new UserVO("1","1@nju.edu.cn","3414141","1",false,1,78,"普通会员",1,"1981/2/2",""));
		if(result7 ==ResultMessage.Exist) System.out.println("updateLevel success");
		ResultMessage result8=userBLService.updateCreditRecord(new UserVO("1","1@nju.edu.cn","3414141","1",false,1,78,"普通会员",1,"1981/2/2",""));
		if(result8 ==ResultMessage.Exist) System.out.println("updateCreditRecord success");
		ResultMessage result9=userBLService.register(new UserVO("1","1@nju.edu.cn","3414141","1",false,1,78,"普通会员",1,"1981/2/2",""));
		if(result9 ==ResultMessage.Exist) System.out.println("register success");
		ResultMessage result10=userBLService.maintainPeersonalInfo(new UserVO("1","1@nju.edu.cn","3414141","1",false,1,78,"普通会员",1,"1981/2/2",""));
		if(result10 ==ResultMessage.Exist) System.out.println("maintainPeersonalInfo success");
		CreditRecordVO result11=userBLService.showCreditRecord(new UserVO("1","1@nju.edu.cn","3414141","1",false,1,78,"普通会员",1,"1981/2/2",""));
		if(result11 ==new CreditRecordVO("1@nju.edu.cn","2016/2/2 12/4/6","4728",0,50,3000)) System.out.println("showCreditRecord success");
		ResultMessage result12=userBLService.topUp(200);
		if(result12 ==ResultMessage.Exist) System.out.println("topUp success");
		ResultMessage result13=userBLService.payment(200);
		if(result13 ==ResultMessage.Exist) System.out.println("payment success");
		UserType result14=userBLService.login("12","12");
		if(result14 ==UserType.Customer) System.out.println("login success");
		ResultMessage result15=userBLService.logout("12");
		if(result15 ==ResultMessage.Exist) System.out.println("logout success");		
	}
}
