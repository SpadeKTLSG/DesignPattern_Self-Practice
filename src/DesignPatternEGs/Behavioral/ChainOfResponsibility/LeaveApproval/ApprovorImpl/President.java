package DesignPatternEGs.Behavioral.ChainOfResponsibility.LeaveApproval.ApprovorImpl;

import DesignPatternEGs.Behavioral.ChainOfResponsibility.LeaveApproval.Approvor;
import DesignPatternEGs.Behavioral.ChainOfResponsibility.LeaveApproval.LeaveApproval;

// 总经理审批者类：具体处理者类
public class President extends Approvor {

    public President(String name) {
        super(name);
    }

    @Override
    public void processApproval(LeaveApproval leaveApproval) {
        if (leaveApproval.getLeaveDays() >= 10 && leaveApproval.getLeaveDays() < 30) {
            System.out.println(name + "审批假条：通过");
        } else {
            System.out.println("不允许此类假条的审批，已被拒绝");
        }
    }
}
