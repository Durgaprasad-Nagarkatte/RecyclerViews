package com.company.durgaprasad.recyclerviews;

/**
 * Created by Durgaprasad on 3/29/2017.
 */

public class Bank {
    private String mBankName;
    private String mMutualFundName;
    private String mCurrentBalance;
    private String mCurrentWithdrawlAmount;
    private int mImageResourceId;

    public Bank(String bankName, String mutualFundName, String currentBalance, String currentWithdrawlAmount,int imageResourceId){
        mBankName = bankName;
        mMutualFundName = mutualFundName;
        mCurrentBalance = currentBalance;
        mCurrentWithdrawlAmount = currentWithdrawlAmount;
        mImageResourceId = imageResourceId;
    }

    public String getBankName(){
        return mBankName;
    }

    public String getMutualFundName(){
        return mMutualFundName;
    }

    public String getCurrentBalance(){
        return mCurrentBalance;
    }

    public String getCurrentWithdrawlAmount(){
        return mCurrentWithdrawlAmount;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
