import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;

/**
 *  访问SimpleService的webservice服务
 *
 *  采用axis2提供的生成工具 wsdl2java把wsdl生成SimpleServiceStub，用于访问webservice服务
 *
 *  这是一个Client
 */
public class SimpleServiceRun {

    public static void main(String[] args) {
        try {
            SimpleServiceStub stub = new SimpleServiceStub();
            //创建一个getGreeting的对象
            SimpleServiceStub.GetGreeting gg = new SimpleServiceStub.GetGreeting();
            gg.setArgs0("boy");
            //创建一个getPrice的对象
            SimpleServiceStub.GetPrice gp = new SimpleServiceStub.GetPrice();
            //输出getGreeting测试结果
            System.out.println("getGreeting: "+stub.getGreeting(gg).get_return());
            //输出getPrice测试结果
            System.out.println("getPrice: "+stub.getPrice(gp).get_return());
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
