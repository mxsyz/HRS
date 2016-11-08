package PO;

import java.io.Serializable;
/**
 * �Ƶ������ʵ��
 * @author LZ
 * @version 1.0
 * @see
 */
public class HotelPO extends PO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String hotelAddress;
	private String hotelDistrict;
	private int hotelStar;
	private String hotelProfile;
	private String hotelService;
	private String hotelName;
	private String hotelPhone;
	private String hotelReservation;
	private String hotelAccount;
	private double score;
	/**
	 * ����Ƶ�����ʵ��
	 * @param hAddress String�ͣ��߼��㴫���ľƵ��ַ
	 * @param hDistrict String�ͣ��߼��㴫���ľƵ�������Ȧ
	 * @param hStar int�ͣ��߼��㴫���ľƵ��Ǽ�
	 * @param hProfile String�ͣ��߼��㴫���ľƵ���
	 * @param hService String�ͣ��߼��㴫���ľƵ����
	 * @param hName String�ͣ��߼��ഫ���ľƵ�����
	 * @param hPhone String�ͣ��߼��ഫ���ľƵ�
	 * @param hReservation String�ͣ��߼��ഫ���ľƵ�Ԥ��״̬
	 * @param hAccount String�ͣ��߼��ഫ���ľƵ��˺�
	 * @param sco double�ͣ��߼��ഫ���ľƵ�����
	 * @return
	 * @throws
	 * @see
	 */
	public HotelPO (String hAddress,String hDistrict,int hStar,String hProfile,String hService,String hName,String hPhone,String hReservation,String hAccount,double sco) {
		
		hotelAddress=hAddress;
		hotelDistrict=hDistrict;
		hotelStar=hStar;
		hotelProfile=hProfile;
		hotelService=hService;
		hotelName=hName;
		hotelPhone=hPhone;
		hotelReservation=hReservation;
		hotelAccount=hAccount;
	    score=sco;
	}
	/**
	 * ��ȡ�Ƶ��ַ
	 * @param
	 * @return ���ؾƵ��ַ
	 * @throws
	 * @see
	 */
	public String gethotelAddress() {
		return hotelAddress;
	}
	/**
	 * ���þƵ��ַ
	 * @param hAddress String�ͣ��߼��㴫���ľƵ��ַ
	 * @return
	 * @throws
	 * @see
	 */
    public void sethotelAddress(String hAddress){
        hotelAddress=hAddress;
    }
    /**
	 * ��ȡ�Ƶ�������Ȧ
	 * @param
	 * @return ���ؾƵ�������Ȧ
	 * @throws
	 * @see
	 */
	public String gethotelDistrict() {
		return hotelDistrict;
	}
	/**
	 * ���þƵ�������Ȧ
	 * @param hDistrict String�ͣ��߼��㴫���ľƵ�������Ȧ
	 * @return
	 * @throws
	 * @see
	 */
    public void sethotelDistrict(String hDistrict){
        hotelDistrict=hDistrict;
    }
    /**
	 * ��ȡ�Ƶ��Ǽ�
	 * @param
	 * @return ���ؾƵ��Ǽ�
	 * @throws
	 * @see
	 */
	public int gethotelStar() {
		return hotelStar;
	}
	/**
	 * ���þƵ��Ǽ�
	 * @param hStar int�ͣ��߼��㴫���ľƵ��Ǽ�
	 * @return
	 * @throws
	 * @see
	 */
    public void sethotelStar(int hStar){
                hotelStar=hStar;
    }
    /**
	 * ��ȡ�Ƶ���
	 * @param
	 * @return ���ؾƵ���
	 * @throws
	 * @see
	 */
	public String gethotelProfile() {
		return hotelProfile;
	}
	/**
	 * ���þƵ���
	 * @param hProfile String �ͣ��߼��㴫���ľƵ���
	 * @return
	 * @throws
	 * @see
	 */
    public void sethotelProfile(String hProfile){
        hotelProfile=hProfile;
    }
    /**
	 * ��ȡ�Ƶ������Ϣ
	 * @param
	 * @return ���ؾƵ������Ϣ
	 * @throws
	 * @see
	 */
	public String gethotelService(){
		return hotelService;
	}
	/**
	 * ���þƵ������Ϣ
	 * @param hService String�ͣ��߼��㴫���ľƵ������Ϣ
	 * @return
	 * @throws
	 * @see
	 */
    public void sethotelService(String hService){
		hotelService=hService;
	}
    /**
	 * ��ȡ�Ƶ�����
	 * @param
	 * @return ���ؾƵ�����
	 * @throws
	 * @see
	 */
	public String gethotelName() {
		return hotelName;
	}
	/**
	 * ���þƵ�����
	 * @param hName String �ͣ��߼��㴫���ľƵ�����
	 * @return
	 * @throws
	 * @see
	 */
    public void sethotelName (String hName){
		hotelName=hName;
	}
    /**
	 * ��ȡ�Ƶ���ϵ��ʽ
	 * @param
	 * @return ���ؾƵ���ϵ��ʽ
	 * @throws
	 * @see
	 */
	public String gethotelPhone() {
		return hotelPhone;
	}
	/**
	 * ���þƵ���ϵ��ʽ
	 * @param hPhone String�ͣ��߼��㴫���ľƵ���ϵ��ʽ
	 * @return
	 * @throws
	 * @see
	 */
    public void sethotelPhone (String hPhone){
		hotelPhone=hPhone;
	}
    /**
	 * ��ȡ�Ƶ�Ԥ��״̬
	 * @param
	 * @return ���ؾƵ�״̬
	 * @throws
	 * @see
	 */
	public String gethotelReservation() {
		return hotelReservation;
	}
	/**
	 * ���þƵ�״̬
	 * @param hReservation String�ͣ��߼��㴫���ľƵ�״̬
	 * @return
	 * @throws
	 * @see
	 */
    public void sethotelReservation (String hReservation){
		hotelReservation=hReservation;
	} 
    /**
	 * ��ȡ�Ƶ�����
	 * @param
	 * @return ���ؾƵ�����
	 * @throws
	 * @see
	 */
    public double getScore() {
		return score;
	}
    /**
	 *  ���þƵ�����
	 * @param sco double �ͣ��߼��㴫���ľƵ�����
	 * @return
	 * @throws
	 * @see
	 */
    public void setScore(double sco) {
		score=sco;
	}
    /**
	 * ��ȡ�Ƶ��˺�
	 * @param
	 * @return ���ؾƵ��˺�
	 * @throws
	 * @see
	 */ 
    public String gethotelAccount() {
		return hotelAccount;
	}
    /**
	 *  ���þƵ��˺�
	 * @param hAcc String�ͣ��߼��㴫���ľƵ��˺�
	 * @return
	 * @throws
	 * @see
	 */
    public void sethotelAccount (String hAcc){
		hotelAccount=hAcc;
	}

}