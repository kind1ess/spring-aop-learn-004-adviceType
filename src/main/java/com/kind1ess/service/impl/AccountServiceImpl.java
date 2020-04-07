package com.kind1ess.service.impl;

import com.kind1ess.service.AccountService;

public class AccountServiceImpl implements AccountService {

    @Override
    public void saveAccount() {
        System.out.println("执行了保存账户");
//        int i = 1/0;
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("执行了更新账户"+i);
    }

    @Override
    public int deleteAccount() {

        System.out.println("执行了删除账户");
        return 0;
    }
}
