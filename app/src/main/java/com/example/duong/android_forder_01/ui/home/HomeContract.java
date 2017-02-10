package com.example.duong.android_forder_01.ui.home;

import com.example.duong.android_forder_01.ui.BasePresenter;
import com.example.duong.android_forder_01.ui.BaseView;

public interface HomeContract {
    interface View extends BaseView<Presenter> {
        void initViewPager();
        void initToolbar();
        void initCategoryRecyclerView();
    }

    interface Presenter extends BasePresenter {
        void openProductResultActivity(String categoryID);
    }
}