package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes3.dex */
public class AddGroupActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.flextv.livestore.dlgfragment.AddChannelDlgFragment addChannelDlgFragment;
    public com.flextv.livestore.dlgfragment.AddGroupDlgFragment addGroupDlgFragment;
    public android.widget.Button btn_add_channel;
    public android.widget.ImageButton btn_back;
    public com.flextv.livestore.adapter.AddCategoryRecyclerAdapter categoryRecyclerAdapter;
    public int category_pos;
    public com.flextv.livestore.adapter.MyChannelRecyclerAdapter channelRecyclerAdapter;
    public int channel_pos;
    public android.widget.ImageView image_add;
    public java.lang.String key;
    public java.util.List<com.flextv.livestore.models.CategoryModel> liveCategories;
    public java.util.List<java.lang.String> myCategories;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.view.LiveVerticalGridView recycler_category;
    public com.flextv.livestore.view.LiveVerticalGridView recycler_channel;
    public com.flextv.livestore.dlgfragment.RenameGroupDlgFragment renameGroupDlgFragment;
    public android.widget.TextView str_add;
    public android.widget.TextView str_groups;
    public android.widget.TextView txt_edit;
    public android.widget.TextView txt_group_name;
    public com.flextv.livestore.models.WordModels wordModels;



    public static /* synthetic */ void $r8$lambda$78mzW6rAkaaMu34jCo1XMgw2HKI(com.flextv.livestore.activities.AddGroupActivity r0, int r1) {
            r0.lambda$showRenameDlgFragment$3(r1)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I3ntboaQjamQa4z8sBm_9oyAZss(com.flextv.livestore.activities.AddGroupActivity r0, java.lang.String r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreate$1(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$IlMoiiOepsbzhneEjDJs80ukswo(com.flextv.livestore.activities.AddGroupActivity r0, boolean r1, java.lang.String r2) {
            r0.lambda$showAddGroupDlgFragment$4(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$MByc2gcBMP3ZsA3_iqNcy9xk0fs() {
            lambda$showAddChannelDlgFragment$6()
            return
    }

    public static /* synthetic */ void $r8$lambda$Tr5fEu62tt7gzcbMMF2VRWc0bj4() {
            lambda$showAddChannelDlgFragment$5()
            return
    }

    public static /* synthetic */ void $r8$lambda$kcAlmJfrZ77DP3V4jn1A47ocbjs(com.flextv.livestore.activities.AddGroupActivity r0, android.view.View r1) {
            r0.lambda$onCreate$2(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$l6XiVZQcPJdruG4Kca6tVnZmp3c(com.flextv.livestore.activities.AddGroupActivity r0, android.view.View r1) {
            r0.lambda$initView$8(r1)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w4GBzF8aC4PekIgtiUCmBImnsO8(com.flextv.livestore.activities.AddGroupActivity r0, java.lang.String r1, java.lang.Integer r2, java.lang.Boolean r3, java.lang.Boolean r4) {
            kotlin.Unit r0 = r0.lambda$onCreate$0(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$zCGSgy9EyXKvXKOnmgan0uoD4q4(com.flextv.livestore.activities.AddGroupActivity r0, java.util.List r1) {
            r0.lambda$showAddChannelDlgFragment$7(r1)
            return
    }

    public AddGroupActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.category_pos = r0
            r1.channel_pos = r0
            java.lang.String r0 = ""
            r1.key = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.myCategories = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.liveCategories = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    private void changeCategoryModel() {
            r7 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            java.util.List r0 = r0.getSharedLiveCategoryModels()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        Ld:
            int r4 = r0.size()
            if (r3 >= r4) goto L38
            java.util.List<java.lang.String> r4 = r7.myCategories
            int r5 = r7.category_pos
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.get(r3)
            com.flextv.livestore.models.CategoryModel r5 = (com.flextv.livestore.models.CategoryModel) r5
            java.lang.String r5 = r5.getName()
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L35
            java.lang.Object r3 = r0.get(r3)
            r1.remove(r3)
            goto L38
        L35:
            int r3 = r3 + 1
            goto Ld
        L38:
            com.flextv.livestore.helper.PreferenceHelper r3 = r7.preferenceHelper
            java.util.List r3 = r3.getSharedPreferenceMyGroupCategory()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L43:
            int r5 = r0.size()
            if (r2 >= r5) goto L6a
            java.util.List<java.lang.String> r5 = r7.myCategories
            int r6 = r7.category_pos
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L67
            java.lang.Object r0 = r3.get(r2)
            r4.remove(r0)
            goto L6a
        L67:
            int r2 = r2 + 1
            goto L43
        L6a:
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            r0.setSharedPreferenceMyGroupCategory(r4)
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            r0.setSharedPreferenceLiveCategory(r1)
            int r0 = r1.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "changeModelSize"
            android.util.Log.e(r1, r0)
            int r0 = r4.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "myModelSize"
            android.util.Log.e(r1, r0)
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceInvisibleLiveCategories()
            com.flextv.livestore.apps.Constants.getLiveGroupModels(r0, r7)
            return
    }

    private void changeRenameCategoryModel(java.lang.String r7) {
            r6 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            java.util.List<java.lang.String> r1 = r6.myCategories
            int r2 = r6.category_pos
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r0 = r0.getSharedPreferenceMyGroupChannels(r1)
            com.flextv.livestore.helper.PreferenceHelper r1 = r6.preferenceHelper
            r1.setSharedPreferenceMyGroupChannels(r7, r0)
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            java.util.List<java.lang.String> r1 = r6.myCategories
            int r2 = r6.category_pos
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.removeKeys(r1)
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            java.util.List r0 = r0.getSharedLiveCategoryModels()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L30:
            int r3 = r0.size()
            if (r2 >= r3) goto L64
            java.lang.Object r3 = r0.get(r2)
            com.flextv.livestore.models.CategoryModel r3 = (com.flextv.livestore.models.CategoryModel) r3
            java.lang.String r3 = r3.getName()
            java.util.List<java.lang.String> r4 = r6.myCategories
            int r5 = r6.category_pos
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L61
            int r0 = r2 + 1
            int r0 = r0 * 1000
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.flextv.livestore.models.CategoryModel r3 = new com.flextv.livestore.models.CategoryModel
            r3.<init>(r0, r7)
            r1.set(r2, r3)
            goto L64
        L61:
            int r2 = r2 + 1
            goto L30
        L64:
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            r0.setSharedPreferenceLiveCategory(r1)
            java.util.List<java.lang.String> r0 = r6.myCategories
            int r1 = r6.category_pos
            r0.set(r1, r7)
            com.flextv.livestore.adapter.AddCategoryRecyclerAdapter r7 = r6.categoryRecyclerAdapter
            java.util.List<java.lang.String> r0 = r6.myCategories
            int r1 = r6.category_pos
            r7.setData(r0, r1)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r6.recycler_category
            int r0 = r6.category_pos
            r7.setSelectedPosition(r0)
            java.util.List<java.lang.String> r7 = r6.myCategories
            r0 = 2
            int r1 = r7.size()
            java.util.List r7 = r7.subList(r0, r1)
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            r0.setSharedPreferenceMyGroupCategory(r7)
            return
    }

    private void initView() {
            r3 = this;
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r3.btn_back = r0
            r0 = 2131428195(0x7f0b0363, float:1.8478028E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.str_groups = r0
            r0 = 2131428311(0x7f0b03d7, float:1.8478263E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_group_name = r0
            r0 = 2131428181(0x7f0b0355, float:1.8478E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.str_add = r0
            r0 = 2131428302(0x7f0b03ce, float:1.8478245E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_edit = r0
            r0 = 2131428074(0x7f0b02ea, float:1.8477782E38)
            android.view.View r0 = r3.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r3.recycler_category = r0
            r0 = 2131428075(0x7f0b02eb, float:1.8477784E38)
            android.view.View r0 = r3.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r3.recycler_channel = r0
            r0 = 2131427461(0x7f0b0085, float:1.8476539E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r3.btn_add_channel = r0
            r0 = 2131427778(0x7f0b01c2, float:1.8477182E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.image_add = r0
            android.widget.TextView r0 = r3.str_groups
            com.flextv.livestore.models.WordModels r1 = r3.wordModels
            java.lang.String r1 = r1.getStr_my_group()
            r0.setText(r1)
            android.widget.Button r0 = r3.btn_add_channel
            com.flextv.livestore.models.WordModels r1 = r3.wordModels
            java.lang.String r1 = r1.getStr_add_channel()
            r0.setText(r1)
            android.widget.TextView r0 = r3.str_add
            com.flextv.livestore.models.WordModels r1 = r3.wordModels
            java.lang.String r1 = r1.getStr_group_string()
            r0.setText(r1)
            android.widget.TextView r0 = r3.txt_edit
            com.flextv.livestore.models.WordModels r1 = r3.wordModels
            java.lang.String r1 = r1.getEdit_group_name()
            r0.setText(r1)
            android.widget.ImageButton r0 = r3.btn_back
            com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda0
            r2 = 1
            r1.<init>(r3, r2)
            r0.setOnClickListener(r1)
            return
    }

    private /* synthetic */ void lambda$initView$8(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r0 = "is_changed"
            java.lang.String r1 = "add_group"
            r3.putExtra(r0, r1)
            r0 = -1
            r2.setResult(r0, r3)
            r2.finish()
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreate$0(java.lang.String r2, java.lang.Integer r3, java.lang.Boolean r4, java.lang.Boolean r5) {
            r1 = this;
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3b
            int r4 = r3.intValue()
            r5 = 0
            if (r4 == 0) goto L35
            android.widget.Button r4 = r1.btn_add_channel
            int r4 = r4.getVisibility()
            r0 = 8
            if (r4 != r0) goto L1c
            android.widget.Button r4 = r1.btn_add_channel
            r4.setVisibility(r5)
        L1c:
            android.widget.Button r4 = r1.btn_add_channel
            r4.requestFocus()
            boolean r4 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r1)
            if (r4 != 0) goto L59
            int r4 = r3.intValue()
            r1.showMyChannels(r2, r4)
            int r2 = r3.intValue()
            r1.category_pos = r2
            goto L59
        L35:
            java.lang.String r2 = ""
            r1.showAddGroupDlgFragment(r5, r2)
            goto L59
        L3b:
            int r4 = r3.intValue()
            r1.category_pos = r4
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L52
            int r4 = r3.intValue()
            r5 = 1
            if (r4 <= r5) goto L52
            r1.showRenameDlgFragment()
            goto L59
        L52:
            int r3 = r3.intValue()
            r1.showMyChannels(r2, r3)
        L59:
            r2 = 0
            return r2
    }

    private /* synthetic */ kotlin.Unit lambda$onCreate$1(java.lang.String r1, java.lang.Integer r2, java.lang.Boolean r3) {
            r0 = this;
            int r1 = r2.intValue()
            r0.channel_pos = r1
            r1 = 0
            return r1
    }

    private /* synthetic */ void lambda$onCreate$2(android.view.View r1) {
            r0 = this;
            r0.showAddChannelDlgFragment()
            return
    }

    private static /* synthetic */ void lambda$showAddChannelDlgFragment$5() {
            return
    }

    private static /* synthetic */ void lambda$showAddChannelDlgFragment$6() {
            return
    }

    private /* synthetic */ void lambda$showAddChannelDlgFragment$7(java.util.List r7) {
            r6 = this;
            int r0 = r6.category_pos
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L47
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r0 = r0.getFavChannelNames()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L28
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            com.flextv.livestore.helper.RealmController r4 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r5 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$8
            r4.addToFavChannels(r3, r2, r5)
            goto L12
        L28:
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            r0.setSharedPreferenceLiveFavChannels(r7)
            java.util.Iterator r0 = r7.iterator()
        L31:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            com.flextv.livestore.helper.RealmController r4 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r5 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$9
            r4.addToFavChannels(r3, r1, r5)
            goto L31
        L47:
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            java.lang.String r1 = r6.key
            r0.setSharedPreferenceMyGroupChannels(r1, r7)
        L4e:
            int r0 = r7.size()
            r1 = 8
            if (r0 != 0) goto L66
            android.widget.ImageView r7 = r6.image_add
            r7.setVisibility(r2)
            android.widget.TextView r7 = r6.str_add
            r7.setVisibility(r2)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r6.recycler_channel
            r7.setVisibility(r1)
            goto L7a
        L66:
            android.widget.ImageView r0 = r6.image_add
            r0.setVisibility(r1)
            android.widget.TextView r0 = r6.str_add
            r0.setVisibility(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_channel
            r0.setVisibility(r2)
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter r0 = r6.channelRecyclerAdapter
            r0.setChannelData(r7, r2)
        L7a:
            return
    }

    private /* synthetic */ void lambda$showAddGroupDlgFragment$4(boolean r4, java.lang.String r5) {
            r3 = this;
            com.flextv.livestore.dlgfragment.AddGroupDlgFragment r0 = r3.addGroupDlgFragment
            r0.dismiss()
            if (r4 == 0) goto Lc
            r3.changeRenameCategoryModel(r5)
            goto La2
        Lc:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.myCategories = r4
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper
            java.util.List r4 = r4.getSharedPreferenceMyGroupCategory()
            r3.myCategories = r4
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper
            java.util.List r4 = r4.getSharedLiveCategoryModels()
            r3.liveCategories = r4
            java.util.List<java.lang.String> r4 = r3.myCategories
            int r4 = r4.size()
            int r4 = r4 * 1000
            int r4 = r4 + 5000
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r3.liveCategories
            java.util.List<java.lang.String> r1 = r3.myCategories
            int r1 = r1.size()
            int r1 = r1 + 4
            com.flextv.livestore.models.CategoryModel r2 = new com.flextv.livestore.models.CategoryModel
            r2.<init>(r4, r5)
            r0.add(r1, r2)
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper
            java.util.List<com.flextv.livestore.models.CategoryModel> r5 = r3.liveCategories
            r4.setSharedPreferenceLiveCategory(r5)
            java.util.List<java.lang.String> r4 = r3.myCategories
            com.flextv.livestore.models.WordModels r5 = r3.wordModels
            java.lang.String r5 = r5.getAdd_group()
            r0 = 0
            r4.add(r0, r5)
            java.util.List<java.lang.String> r4 = r3.myCategories
            com.flextv.livestore.models.WordModels r5 = r3.wordModels
            java.lang.String r5 = r5.getFavorite()
            r1 = 1
            r4.add(r1, r5)
            com.flextv.livestore.adapter.AddCategoryRecyclerAdapter r4 = r3.categoryRecyclerAdapter
            java.util.List<java.lang.String> r5 = r3.myCategories
            int r2 = r5.size()
            int r2 = r2 - r1
            r4.setData(r5, r2)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_category
            java.util.List<java.lang.String> r5 = r3.myCategories
            int r5 = r5.size()
            int r5 = r5 - r1
            r4.setSelectedPosition(r5)
            boolean r4 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r3)
            if (r4 != 0) goto L93
            java.util.List<java.lang.String> r4 = r3.myCategories
            int r4 = r4.size()
            int r4 = r4 - r1
            r3.category_pos = r4
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter r4 = r3.channelRecyclerAdapter
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.setChannelData(r5, r0)
        L93:
            android.widget.Button r4 = r3.btn_add_channel
            int r4 = r4.getVisibility()
            r5 = 8
            if (r4 != r5) goto La2
            android.widget.Button r4 = r3.btn_add_channel
            r4.setVisibility(r0)
        La2:
            return
    }

    private /* synthetic */ void lambda$showRenameDlgFragment$3(int r3) {
            r2 = this;
            if (r3 != 0) goto L11
            r3 = 1
            java.util.List<java.lang.String> r0 = r2.myCategories
            int r1 = r2.category_pos
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r2.showAddGroupDlgFragment(r3, r0)
            goto L45
        L11:
            r2.changeCategoryModel()
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.preferenceHelper
            java.util.List<java.lang.String> r0 = r2.myCategories
            int r1 = r2.category_pos
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r3.removeKeys(r0)
            java.util.List<java.lang.String> r3 = r2.myCategories
            int r0 = r2.category_pos
            java.lang.Object r0 = r3.get(r0)
            r3.remove(r0)
            com.flextv.livestore.adapter.AddCategoryRecyclerAdapter r3 = r2.categoryRecyclerAdapter
            java.util.List<java.lang.String> r0 = r2.myCategories
            r1 = 0
            r3.setData(r0, r1)
            com.flextv.livestore.view.LiveVerticalGridView r3 = r2.recycler_category
            r3.setSelectedPosition(r1)
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter r3 = r2.channelRecyclerAdapter
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.setChannelData(r0, r1)
        L45:
            return
    }

    private void showAddChannelDlgFragment() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_add_channel"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L18
            r1.remove(r3)
            r0 = 0
            r1.addToBackStack(r0)
            return
        L18:
            java.lang.String r1 = r4.key
            int r3 = r4.category_pos
            com.flextv.livestore.dlgfragment.AddChannelDlgFragment r1 = com.flextv.livestore.dlgfragment.AddChannelDlgFragment.newInstance(r1, r3)
            r4.addChannelDlgFragment = r1
            com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda1 r3 = new com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda1
            r3.<init>(r4)
            r1.setOnSendMyGroupNamesListener(r3)
            com.flextv.livestore.dlgfragment.AddChannelDlgFragment r1 = r4.addChannelDlgFragment
            r1.show(r0, r2)
            return
    }

    private void showAddGroupDlgFragment(boolean r5, java.lang.String r6) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_add_group"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L18
            r1.remove(r3)
            r5 = 0
            r1.addToBackStack(r5)
            return
        L18:
            com.flextv.livestore.dlgfragment.AddGroupDlgFragment r6 = com.flextv.livestore.dlgfragment.AddGroupDlgFragment.newInstance(r5, r6)
            r4.addGroupDlgFragment = r6
            com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda2
            r3 = 0
            r1.<init>(r4, r5, r3)
            r6.setOnAddedGroupListener(r1)
            com.flextv.livestore.dlgfragment.AddGroupDlgFragment r5 = r4.addGroupDlgFragment
            r5.show(r0, r2)
            return
    }

    private void showMyChannels(java.lang.String r4, int r5) {
            r3 = this;
            r0 = 8
            r1 = 0
            if (r5 != 0) goto L20
            android.widget.Button r4 = r3.btn_add_channel
            r4.setVisibility(r0)
            android.widget.TextView r4 = r3.txt_group_name
            r4.setVisibility(r0)
            android.widget.ImageView r4 = r3.image_add
            r4.setVisibility(r1)
            android.widget.TextView r4 = r3.str_add
            r4.setVisibility(r1)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_channel
            r4.setVisibility(r0)
            goto La6
        L20:
            r2 = 1
            if (r5 != r2) goto L65
            r3.key = r4
            android.widget.Button r5 = r3.btn_add_channel
            r5.setVisibility(r1)
            android.widget.TextView r5 = r3.txt_group_name
            r5.setVisibility(r1)
            android.widget.TextView r5 = r3.txt_group_name
            r5.setText(r4)
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper
            java.util.List r4 = r4.getSharedPreferenceLiveFavChannels()
            int r5 = r4.size()
            if (r5 != 0) goto L50
            android.widget.ImageView r4 = r3.image_add
            r4.setVisibility(r1)
            android.widget.TextView r4 = r3.str_add
            r4.setVisibility(r1)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_channel
            r4.setVisibility(r0)
            goto La6
        L50:
            android.widget.ImageView r5 = r3.image_add
            r5.setVisibility(r0)
            android.widget.TextView r5 = r3.str_add
            r5.setVisibility(r0)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r3.recycler_channel
            r5.setVisibility(r1)
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter r5 = r3.channelRecyclerAdapter
            r5.setChannelData(r4, r1)
            goto La6
        L65:
            r3.key = r4
            android.widget.Button r5 = r3.btn_add_channel
            r5.setVisibility(r1)
            android.widget.TextView r5 = r3.txt_group_name
            r5.setVisibility(r1)
            android.widget.TextView r5 = r3.txt_group_name
            r5.setText(r4)
            com.flextv.livestore.helper.PreferenceHelper r5 = r3.preferenceHelper
            java.util.List r4 = r5.getSharedPreferenceMyGroupChannels(r4)
            int r5 = r4.size()
            if (r5 != 0) goto L92
            android.widget.ImageView r4 = r3.image_add
            r4.setVisibility(r1)
            android.widget.TextView r4 = r3.str_add
            r4.setVisibility(r1)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_channel
            r4.setVisibility(r0)
            goto La6
        L92:
            android.widget.ImageView r5 = r3.image_add
            r5.setVisibility(r0)
            android.widget.TextView r5 = r3.str_add
            r5.setVisibility(r0)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r3.recycler_channel
            r5.setVisibility(r1)
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter r5 = r3.channelRecyclerAdapter
            r5.setChannelData(r4, r1)
        La6:
            return
    }

    private void showRenameDlgFragment() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_rename"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L18
            r1.remove(r3)
            r0 = 0
            r1.addToBackStack(r0)
            return
        L18:
            com.flextv.livestore.dlgfragment.RenameGroupDlgFragment r1 = new com.flextv.livestore.dlgfragment.RenameGroupDlgFragment
            r1.<init>()
            r4.renameGroupDlgFragment = r1
            com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda1 r3 = new com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda1
            r3.<init>(r4)
            r1.setSelectListener(r3)
            com.flextv.livestore.dlgfragment.RenameGroupDlgFragment r1 = r4.renameGroupDlgFragment
            r1.show(r0, r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L9a
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 == r1) goto L87
            r1 = 1
            switch(r0) {
                case 19: goto L5e;
                case 20: goto L42;
                case 21: goto L2f;
                case 22: goto L13;
                default: goto L11;
            }
        L11:
            goto L9a
        L13:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_category
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9a
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_channel
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L29
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_channel
            r4.requestFocus()
            goto L2e
        L29:
            android.widget.Button r4 = r3.btn_add_channel
            r4.requestFocus()
        L2e:
            return r1
        L2f:
            android.widget.Button r0 = r3.btn_add_channel
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9a
            android.widget.ImageButton r4 = r3.btn_back
            r4.setFocusable(r1)
            android.widget.ImageButton r4 = r3.btn_back
            r4.requestFocus()
            return r1
        L42:
            android.widget.Button r0 = r3.btn_add_channel
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9a
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_channel
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L9a
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_channel
            r4.requestFocus()
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_channel
            r0 = 0
            r4.setSelectedPosition(r0)
            return r1
        L5e:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_channel
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L70
            int r0 = r3.channel_pos
            if (r0 != 0) goto L70
            android.widget.Button r4 = r3.btn_add_channel
            r4.requestFocus()
            return r1
        L70:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_category
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9a
            int r0 = r3.category_pos
            if (r0 != 0) goto L9a
            android.widget.ImageButton r4 = r3.btn_back
            r4.setFocusable(r1)
            android.widget.ImageButton r4 = r3.btn_back
            r4.requestFocus()
            return r1
        L87:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "is_changed"
            java.lang.String r2 = "add_group"
            r0.putExtra(r1, r2)
            r1 = -1
            r3.setResult(r1, r0)
            r3.finish()
        L9a:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            r6 = 2131623964(0x7f0e001c, float:1.8875094E38)
            r5.setContentView(r6)
            com.flextv.livestore.utils.Utils.FullScreenCall(r5)
            com.flextv.livestore.helper.PreferenceHelper r6 = new com.flextv.livestore.helper.PreferenceHelper
            r6.<init>(r5)
            r5.preferenceHelper = r6
            com.flextv.livestore.models.WordModels r6 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r5)
            r5.wordModels = r6
            r5.initView()
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            java.util.List r6 = r6.getSharedLiveCategoryModels()
            r5.liveCategories = r6
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            java.util.List r6 = r6.getSharedPreferenceMyGroupCategory()
            r5.myCategories = r6
            com.flextv.livestore.models.WordModels r0 = r5.wordModels
            java.lang.String r0 = r0.getAdd_group()
            r1 = 0
            r6.add(r1, r0)
            java.util.List<java.lang.String> r6 = r5.myCategories
            com.flextv.livestore.models.WordModels r0 = r5.wordModels
            java.lang.String r0 = r0.getFavorite()
            r2 = 1
            r6.add(r2, r0)
            com.flextv.livestore.adapter.AddCategoryRecyclerAdapter r6 = new com.flextv.livestore.adapter.AddCategoryRecyclerAdapter
            java.util.List<java.lang.String> r0 = r5.myCategories
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda4 r3 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda4
            r3.<init>(r5, r2)
            r6.<init>(r5, r0, r2, r3)
            r5.categoryRecyclerAdapter = r6
            com.flextv.livestore.view.LiveVerticalGridView r0 = r5.recycler_category
            r0.setAdapter(r6)
            boolean r6 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r5)
            r0 = 0
            if (r6 == 0) goto L75
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.recycler_category
            r6.setNumColumns(r2)
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.recycler_category
            r6.setPreserveFocusAfterLayout(r2)
            android.view.View[] r6 = new android.view.View[r2]
            r6[r1] = r0
            com.flextv.livestore.view.LiveVerticalGridView r3 = r5.recycler_category
            com.flextv.livestore.activities.AddGroupActivity$1 r4 = new com.flextv.livestore.activities.AddGroupActivity$1
            r4.<init>(r6)
            r3.setOnChildViewHolderSelectedListener(r4)
            goto L7f
        L75:
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.recycler_category
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r3.<init>(r5)
            r6.setLayoutManager(r3)
        L7f:
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter r6 = new com.flextv.livestore.adapter.MyChannelRecyclerAdapter
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3 r4 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3
            r4.<init>(r5, r2)
            r6.<init>(r5, r3, r2, r4)
            r5.channelRecyclerAdapter = r6
            com.flextv.livestore.view.LiveVerticalGridView r3 = r5.recycler_channel
            r3.setAdapter(r6)
            boolean r6 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r5)
            if (r6 == 0) goto Lb9
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.recycler_channel
            r6.setNumColumns(r2)
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.recycler_channel
            r6.setLoop(r1)
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.recycler_channel
            r6.setPreserveFocusAfterLayout(r2)
            android.view.View[] r6 = new android.view.View[r2]
            r6[r1] = r0
            com.flextv.livestore.view.LiveVerticalGridView r0 = r5.recycler_channel
            com.flextv.livestore.activities.AddGroupActivity$2 r2 = new com.flextv.livestore.activities.AddGroupActivity$2
            r2.<init>(r6)
            r0.setOnChildViewHolderSelectedListener(r2)
            goto Lc3
        Lb9:
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.recycler_channel
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r5)
            r6.setLayoutManager(r0)
        Lc3:
            android.widget.ImageButton r6 = r5.btn_back
            r6.setFocusable(r1)
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.recycler_category
            r6.setSelectedPosition(r1)
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.recycler_category
            r6.requestFocus()
            android.widget.Button r6 = r5.btn_add_channel
            r0 = 8
            r6.setVisibility(r0)
            android.widget.Button r6 = r5.btn_add_channel
            com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda0
            r0.<init>(r5, r1)
            r6.setOnClickListener(r0)
            return
    }
}
