package com.example.duong.android_forder_01.ui.shopmanagement;

import com.example.duong.android_forder_01.data.model.Shop;
import com.example.duong.android_forder_01.data.model.ShopDomain;
import com.example.duong.android_forder_01.data.model.ShopManagement;
import com.example.duong.android_forder_01.ui.BasePresenter;
import com.example.duong.android_forder_01.ui.BaseView;

import java.util.List;

/**
 * Created by tri on 02/03/2017.
 */
public interface ShopManagementContract {
    interface View extends BaseView<Presenter> {
        void showDetailShop(ShopManagement shop);
        void showAllShop(List<ShopManagement> list);
        void showGetDataError();
        void getInfomationUser();
    }

    interface Presenter extends BasePresenter {
        void getShopByUser(int userId, String userToken);
        void sendRequest(ShopDomain shopDomain, Shop shop);
        void cancelRequest(ShopDomain shopDomain, Shop shop);
        void rejectRequest(ShopDomain shopDomain, Shop shop);
        void openDetailShop(ShopManagement shopManagement);
    }
}
