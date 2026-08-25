package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes2.dex */
public class CategoryActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public java.util.List<com.flextv.livestore.models.CategoryModel> categoryModels;
    public int category_position;
    public android.widget.EditText et_search;
    public com.flextv.livestore.dlgfragment.LockDlgFragment lockDlgFragment;
    public int pre_category_pos;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.view.LiveVerticalGridView recycler_category;
    public androidx.activity.result.ActivityResultLauncher<android.content.Intent> someActivityResultLauncher;
    public android.widget.TextView txt_home;
    public android.widget.TextView txt_live;
    public android.widget.TextView txt_movie;
    public android.widget.TextView txt_series;
    public com.flextv.livestore.models.WordModels wordModels;







    /* JADX INFO: renamed from: com.flextv.livestore.activities.CategoryActivity$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] $SwitchMap$com$flextv$livestore$apps$HomeType = null;

        static {
                com.flextv.livestore.apps.HomeType[] r0 = com.flextv.livestore.apps.HomeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.flextv.livestore.activities.CategoryActivity.AnonymousClass7.$SwitchMap$com$flextv$livestore$apps$HomeType = r0
                com.flextv.livestore.apps.HomeType r1 = com.flextv.livestore.apps.HomeType.movies     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.flextv.livestore.activities.CategoryActivity.AnonymousClass7.$SwitchMap$com$flextv$livestore$apps$HomeType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.flextv.livestore.apps.HomeType r1 = com.flextv.livestore.apps.HomeType.series     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.flextv.livestore.activities.CategoryActivity.AnonymousClass7.$SwitchMap$com$flextv$livestore$apps$HomeType     // Catch: java.lang.NoSuchFieldError -> L28
                com.flextv.livestore.apps.HomeType r1 = com.flextv.livestore.apps.HomeType.live     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$93dh1J5G08UrMHsPQd2-wx37RGA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m49$r8$lambda$93dh1J5G08UrMHsPQd2wx37RGA(com.flextv.livestore.activities.CategoryActivity r0, com.flextv.livestore.models.CategoryModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$setCategoryAdapter$1(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GJYWUsuqrBmiUBC5xIk7PugMqo0(com.flextv.livestore.activities.CategoryActivity r0, com.flextv.livestore.models.CategoryModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$setCategoryAdapter$0(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$_Is5RkSmGzFKH9AxnXxiOvfnomA(com.flextv.livestore.activities.CategoryActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$new$3(r1)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ejVRaV3YHn3buteF02j79hfo2IQ(com.flextv.livestore.activities.CategoryActivity r0, com.flextv.livestore.models.CategoryModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$setCategoryAdapter$2(r1, r2, r3)
            return r0
    }

    static {
            java.lang.Class<com.flextv.livestore.activities.CategoryActivity> r0 = com.flextv.livestore.activities.CategoryActivity.class
            return
    }

    public CategoryActivity() {
            r3 = this;
            r3.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r3.wordModels = r0
            r0 = 0
            r3.category_position = r0
            r3.pre_category_pos = r0
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2
            r2 = 3
            r1.<init>(r3, r2)
            androidx.activity.result.ActivityResultLauncher r0 = r3.registerForActivityResult(r0, r1)
            r3.someActivityResultLauncher = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.activities.CategoryActivity r0, java.lang.String r1) {
            r0.searchCategoryModel(r1)
            return
    }

    public static /* synthetic */ boolean access$100(com.flextv.livestore.activities.CategoryActivity r0, java.lang.String r1) {
            boolean r0 = r0.checkAdultCategory(r1)
            return r0
    }

    public static /* synthetic */ void access$200(com.flextv.livestore.activities.CategoryActivity r0, com.flextv.livestore.models.CategoryModel r1) {
            r0.showLockDlgFragment(r1)
            return
    }

    public static /* synthetic */ int access$300(com.flextv.livestore.activities.CategoryActivity r0, com.flextv.livestore.models.CategoryModel r1) {
            int r0 = r0.getCategoryPosition(r1)
            return r0
    }

    private boolean checkAdultCategory(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "xxx"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "porn"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "adult"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = 0
            goto L1d
        L1c:
            r2 = 1
        L1d:
            return r2
    }

    private int getCategoryPosition(com.flextv.livestore.models.CategoryModel r5) {
            r4 = this;
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r4.categoryModels
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L2c
            r0 = 0
        La:
            java.util.List<com.flextv.livestore.models.CategoryModel> r2 = r4.categoryModels
            int r2 = r2.size()
            if (r0 >= r2) goto L2c
            java.lang.String r2 = r5.getName()
            java.util.List<com.flextv.livestore.models.CategoryModel> r3 = r4.categoryModels
            java.lang.Object r3 = r3.get(r0)
            com.flextv.livestore.models.CategoryModel r3 = (com.flextv.livestore.models.CategoryModel) r3
            java.lang.String r3 = r3.getName()
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L29
            return r0
        L29:
            int r0 = r0 + 1
            goto La
        L2c:
            return r1
    }

    private void initView() {
            r4 = this;
            r0 = 2131428313(0x7f0b03d9, float:1.8478267E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_home = r0
            r0 = 2131428316(0x7f0b03dc, float:1.8478273E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_live = r0
            r0 = 2131428322(0x7f0b03e2, float:1.8478285E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_movie = r0
            r0 = 2131428343(0x7f0b03f7, float:1.8478328E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_series = r0
            r0 = 2131427629(0x7f0b012d, float:1.847688E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r4.et_search = r0
            android.widget.TextView r0 = r4.txt_home
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getHome()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_live
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getLive_tv()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_movie
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getMovies()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_series
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getSeries()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_home
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.txt_live
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.txt_movie
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.txt_series
            r0.setOnClickListener(r4)
            r0 = 2131428074(0x7f0b02ea, float:1.8477782E38)
            android.view.View r0 = r4.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r4.recycler_category = r0
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r4)
            r1 = 3
            r2 = 1
            if (r0 == 0) goto Laa
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_category
            r0.setNumColumns(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_category
            r1 = 0
            r0.setLoop(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_category
            r0.setPreserveFocusAfterLayout(r2)
            android.view.View[] r0 = new android.view.View[r2]
            r2 = 0
            r0[r1] = r2
            com.flextv.livestore.view.LiveVerticalGridView r1 = r4.recycler_category
            com.flextv.livestore.activities.CategoryActivity$1 r2 = new com.flextv.livestore.activities.CategoryActivity$1
            r2.<init>(r0)
            r1.setOnChildViewHolderSelectedListener(r2)
            goto Lb9
        Laa:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_category
            androidx.recyclerview.widget.GridLayoutManager r3 = new androidx.recyclerview.widget.GridLayoutManager
            r3.<init>(r4, r1)
            r0.setLayoutManager(r3)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_category
            r0.setHasFixedSize(r2)
        Lb9:
            android.widget.EditText r0 = r4.et_search
            com.flextv.livestore.activities.CategoryActivity$2 r1 = new com.flextv.livestore.activities.CategoryActivity$2
            r1.<init>(r4)
            r0.addTextChangedListener(r1)
            return
    }

    private /* synthetic */ void lambda$new$3(androidx.activity.result.ActivityResult r4) {
            r3 = this;
            int r0 = r4.getResultCode()
            r1 = -1
            if (r0 != r1) goto L82
            android.content.Intent r4 = r4.getData()
            if (r4 == 0) goto L82
            java.lang.String r0 = "is_changed"
            java.lang.String r4 = r4.getStringExtra(r0)
            java.lang.String r4 = r4.toLowerCase()
            java.util.Objects.requireNonNull(r4)
            int r0 = r4.hashCode()
            r2 = 0
            switch(r0) {
                case -905838985: goto L4f;
                case 3208415: goto L44;
                case 3322092: goto L39;
                case 104087344: goto L2e;
                case 332404065: goto L23;
                default: goto L22;
            }
        L22:
            goto L5a
        L23:
            java.lang.String r0 = "add_group"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2c
            goto L5a
        L2c:
            r1 = 4
            goto L5a
        L2e:
            java.lang.String r0 = "movie"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L37
            goto L5a
        L37:
            r1 = 3
            goto L5a
        L39:
            java.lang.String r0 = "live"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L42
            goto L5a
        L42:
            r1 = 2
            goto L5a
        L44:
            java.lang.String r0 = "home"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L4d
            goto L5a
        L4d:
            r1 = 1
            goto L5a
        L4f:
            java.lang.String r0 = "series"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L59
            goto L5a
        L59:
            r1 = 0
        L5a:
            switch(r1) {
                case 0: goto L78;
                case 1: goto L74;
                case 2: goto L69;
                case 3: goto L5e;
                case 4: goto L69;
                default: goto L5d;
            }
        L5d:
            goto L82
        L5e:
            com.flextv.livestore.apps.HomeType r4 = com.flextv.livestore.apps.HomeType.movies
            com.flextv.livestore.apps.LTVApp.homeType = r4
            r3.setTextColor()
            r3.setCategoryAdapter(r2)
            goto L82
        L69:
            com.flextv.livestore.apps.HomeType r4 = com.flextv.livestore.apps.HomeType.live
            com.flextv.livestore.apps.LTVApp.homeType = r4
            r3.setTextColor()
            r3.setCategoryAdapter(r2)
            goto L82
        L74:
            r3.finish()
            goto L82
        L78:
            com.flextv.livestore.apps.HomeType r4 = com.flextv.livestore.apps.HomeType.series
            com.flextv.livestore.apps.LTVApp.homeType = r4
            r3.setTextColor()
            r3.setCategoryAdapter(r2)
        L82:
            return
    }

    private /* synthetic */ kotlin.Unit lambda$setCategoryAdapter$0(com.flextv.livestore.models.CategoryModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            r0 = this;
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L2a
            java.lang.String r3 = r1.getName()
            java.lang.String r3 = r3.toLowerCase()
            boolean r3 = r0.checkAdultCategory(r3)
            if (r3 == 0) goto L18
            r0.showLockDlgFragment(r1)
            goto L30
        L18:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.MovieSecondActivity> r3 = com.flextv.livestore.activities.MovieSecondActivity.class
            r1.<init>(r0, r3)
            java.lang.String r3 = "category_pos"
            r1.putExtra(r3, r2)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r2 = r0.someActivityResultLauncher
            r2.launch(r1)
            goto L30
        L2a:
            int r1 = r2.intValue()
            r0.pre_category_pos = r1
        L30:
            r1 = 0
            return r1
    }

    private /* synthetic */ kotlin.Unit lambda$setCategoryAdapter$1(com.flextv.livestore.models.CategoryModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            r0 = this;
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L2a
            java.lang.String r3 = r1.getName()
            java.lang.String r3 = r3.toLowerCase()
            boolean r3 = r0.checkAdultCategory(r3)
            if (r3 == 0) goto L18
            r0.showLockDlgFragment(r1)
            goto L30
        L18:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.SeriesSecondActivity> r3 = com.flextv.livestore.activities.SeriesSecondActivity.class
            r1.<init>(r0, r3)
            java.lang.String r3 = "category_pos"
            r1.putExtra(r3, r2)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r2 = r0.someActivityResultLauncher
            r2.launch(r1)
            goto L30
        L2a:
            int r1 = r2.intValue()
            r0.pre_category_pos = r1
        L30:
            r1 = 0
            return r1
    }

    private /* synthetic */ kotlin.Unit lambda$setCategoryAdapter$2(com.flextv.livestore.models.CategoryModel r3, java.lang.Integer r4, java.lang.Boolean r5) {
            r2 = this;
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L93
            int r5 = r4.intValue()
            if (r5 != 0) goto L1a
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r3 = r2.someActivityResultLauncher
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.AddGroupActivity> r5 = com.flextv.livestore.activities.AddGroupActivity.class
            r4.<init>(r2, r5)
            r3.launch(r4)
            goto L99
        L1a:
            java.lang.String r5 = r3.getName()
            java.lang.String r5 = r5.toLowerCase()
            boolean r5 = r2.checkAdultCategory(r5)
            java.lang.String r0 = "lock_id"
            r1 = 0
            if (r5 != 0) goto L67
            java.lang.String r5 = r3.getId()
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L36
            goto L67
        L36:
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.preferenceHelper
            int r4 = r4.intValue()
            r3.setSharedPreferenceCategoryPos(r4)
            boolean r3 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r2)
            java.lang.String r4 = "is_full"
            if (r3 == 0) goto L57
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.LiveChannelActivity> r5 = com.flextv.livestore.activities.LiveChannelActivity.class
            r3.<init>(r2, r5)
            r3.putExtra(r4, r1)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r4 = r2.someActivityResultLauncher
            r4.launch(r3)
            goto L99
        L57:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.mobile.LiveChannelMobileActivity> r5 = com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.class
            r3.<init>(r2, r5)
            r3.putExtra(r4, r1)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r4 = r2.someActivityResultLauncher
            r4.launch(r3)
            goto L99
        L67:
            java.lang.String r4 = r3.getId()
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 == 0) goto L8f
            com.flextv.livestore.helper.PreferenceHelper r4 = r2.preferenceHelper
            java.util.List r4 = r4.getSharedPreferenceLiveLockChannels()
            int r4 = r4.size()
            if (r4 <= 0) goto L81
            r2.showLockDlgFragment(r3)
            goto L99
        L81:
            com.flextv.livestore.models.WordModels r3 = r2.wordModels
            java.lang.String r3 = r3.getStr_no_lock_channels()
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r1)
            r3.show()
            goto L99
        L8f:
            r2.showLockDlgFragment(r3)
            goto L99
        L93:
            int r3 = r4.intValue()
            r2.pre_category_pos = r3
        L99:
            r3 = 0
            return r3
    }

    private void searchCategoryModel(java.lang.String r9) {
            r8 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto Ld
            int r9 = r8.category_position
            r8.setCategoryAdapter(r9)
            goto L9a
        Ld:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r8.categoryModels
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.lang.String r3 = r1.getName()
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r4 = r9.toLowerCase()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L18
            r2.add(r1)
            goto L18
        L3a:
            int[] r9 = com.flextv.livestore.activities.CategoryActivity.AnonymousClass7.$SwitchMap$com$flextv$livestore$apps$HomeType
            com.flextv.livestore.apps.HomeType r0 = com.flextv.livestore.apps.LTVApp.homeType
            int r0 = r0.ordinal()
            r9 = r9[r0]
            r0 = 1
            if (r9 == r0) goto L80
            r0 = 2
            if (r9 == r0) goto L65
            com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter r9 = new com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter
            com.flextv.livestore.helper.PreferenceHelper r0 = r8.preferenceHelper
            boolean r3 = r0.getSharedPreferenceISM3U()
            r4 = 1
            int r5 = r8.category_position
            com.flextv.livestore.activities.CategoryActivity$5 r6 = new com.flextv.livestore.activities.CategoryActivity$5
            r6.<init>(r8)
            r0 = r9
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r8.recycler_category
            r0.setAdapter(r9)
            goto L9a
        L65:
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter r9 = new com.flextv.livestore.adapter.RecyclerVodCategoryAdapter
            r3 = 0
            r4 = 1
            com.flextv.livestore.helper.PreferenceHelper r0 = r8.preferenceHelper
            boolean r5 = r0.getSharedPreferenceISM3U()
            r6 = 0
            com.flextv.livestore.activities.CategoryActivity$4 r7 = new com.flextv.livestore.activities.CategoryActivity$4
            r7.<init>(r8)
            r0 = r9
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r8.recycler_category
            r0.setAdapter(r9)
            goto L9a
        L80:
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter r9 = new com.flextv.livestore.adapter.RecyclerVodCategoryAdapter
            r3 = 0
            r4 = 1
            com.flextv.livestore.helper.PreferenceHelper r0 = r8.preferenceHelper
            boolean r5 = r0.getSharedPreferenceISM3U()
            r6 = 1
            com.flextv.livestore.activities.CategoryActivity$3 r7 = new com.flextv.livestore.activities.CategoryActivity$3
            r7.<init>(r8)
            r0 = r9
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r8.recycler_category
            r0.setAdapter(r9)
        L9a:
            return
    }

    private void setCategoryAdapter(int r11) {
            r10 = this;
            int[] r0 = com.flextv.livestore.activities.CategoryActivity.AnonymousClass7.$SwitchMap$com$flextv$livestore$apps$HomeType
            com.flextv.livestore.apps.HomeType r1 = com.flextv.livestore.apps.LTVApp.homeType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L64
            r2 = 2
            if (r0 == r2) goto L3c
            com.flextv.livestore.helper.PreferenceHelper r0 = r10.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceInvisibleLiveCategories()
            com.flextv.livestore.apps.Constants.getLiveGroupModels(r0, r10)
            java.util.List<com.flextv.livestore.models.CategoryModel> r5 = com.flextv.livestore.apps.LTVApp.live_categories_filter
            r10.categoryModels = r5
            com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter r0 = new com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter
            com.flextv.livestore.helper.PreferenceHelper r1 = r10.preferenceHelper
            boolean r6 = r1.getSharedPreferenceISM3U()
            r7 = 1
            com.flextv.livestore.activities.CategoryActivity$$ExternalSyntheticLambda0 r9 = new com.flextv.livestore.activities.CategoryActivity$$ExternalSyntheticLambda0
            r9.<init>(r10, r2)
            r3 = r0
            r4 = r10
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.flextv.livestore.view.LiveVerticalGridView r1 = r10.recycler_category
            r1.setAdapter(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r10.recycler_category
            r0.setSelectedPosition(r11)
            goto L8c
        L3c:
            com.flextv.livestore.helper.PreferenceHelper r0 = r10.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceInvisibleSeriesCategories()
            com.flextv.livestore.apps.Constants.getSeriesGroupModels(r0, r10)
            java.util.List<com.flextv.livestore.models.CategoryModel> r4 = com.flextv.livestore.apps.LTVApp.series_categories_filter
            r10.categoryModels = r4
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter r0 = new com.flextv.livestore.adapter.RecyclerVodCategoryAdapter
            r6 = 1
            com.flextv.livestore.helper.PreferenceHelper r2 = r10.preferenceHelper
            boolean r7 = r2.getSharedPreferenceISM3U()
            r8 = 0
            com.flextv.livestore.activities.CategoryActivity$$ExternalSyntheticLambda0 r9 = new com.flextv.livestore.activities.CategoryActivity$$ExternalSyntheticLambda0
            r9.<init>(r10, r1)
            r2 = r0
            r3 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.flextv.livestore.view.LiveVerticalGridView r11 = r10.recycler_category
            r11.setAdapter(r0)
            goto L8c
        L64:
            com.flextv.livestore.helper.PreferenceHelper r0 = r10.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceInvisibleVodCategories()
            com.flextv.livestore.apps.Constants.getVodGroupModels(r0, r10)
            java.util.List<com.flextv.livestore.models.CategoryModel> r3 = com.flextv.livestore.apps.LTVApp.vod_categories_filter
            r10.categoryModels = r3
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter r0 = new com.flextv.livestore.adapter.RecyclerVodCategoryAdapter
            r5 = 1
            com.flextv.livestore.helper.PreferenceHelper r1 = r10.preferenceHelper
            boolean r6 = r1.getSharedPreferenceISM3U()
            r7 = 1
            com.flextv.livestore.activities.CategoryActivity$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.activities.CategoryActivity$$ExternalSyntheticLambda0
            r1 = 0
            r8.<init>(r10, r1)
            r1 = r0
            r2 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.flextv.livestore.view.LiveVerticalGridView r11 = r10.recycler_category
            r11.setAdapter(r0)
        L8c:
            return
    }

    private void setFocusTopView(boolean r2) {
            r1 = this;
            android.widget.TextView r0 = r1.txt_home
            r0.setFocusable(r2)
            android.widget.TextView r0 = r1.txt_live
            r0.setFocusable(r2)
            android.widget.TextView r0 = r1.txt_movie
            r0.setFocusable(r2)
            android.widget.TextView r0 = r1.txt_series
            r0.setFocusable(r2)
            android.widget.EditText r0 = r1.et_search
            r0.setFocusable(r2)
            return
    }

    private void setTextColor() {
            r4 = this;
            int[] r0 = com.flextv.livestore.activities.CategoryActivity.AnonymousClass7.$SwitchMap$com$flextv$livestore$apps$HomeType
            com.flextv.livestore.apps.HomeType r1 = com.flextv.livestore.apps.LTVApp.homeType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 2131100408(0x7f0602f8, float:1.7813197E38)
            r3 = 2131100407(0x7f0602f7, float:1.7813195E38)
            if (r0 == r1) goto L6a
            r1 = 2
            if (r0 == r1) goto L42
            r1 = 3
            if (r0 == r1) goto L1a
            goto L91
        L1a:
            android.widget.TextView r0 = r4.txt_live
            android.content.res.Resources r1 = r4.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.txt_movie
            android.content.res.Resources r1 = r4.getResources()
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.txt_series
            android.content.res.Resources r1 = r4.getResources()
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
            goto L91
        L42:
            android.widget.TextView r0 = r4.txt_live
            android.content.res.Resources r1 = r4.getResources()
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.txt_movie
            android.content.res.Resources r1 = r4.getResources()
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.txt_series
            android.content.res.Resources r1 = r4.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L91
        L6a:
            android.widget.TextView r0 = r4.txt_live
            android.content.res.Resources r1 = r4.getResources()
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.txt_movie
            android.content.res.Resources r1 = r4.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.txt_series
            android.content.res.Resources r1 = r4.getResources()
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
        L91:
            return
    }

    private void showLockDlgFragment(com.flextv.livestore.models.CategoryModel r5) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_lock"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r5 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r5)
            return
        L15:
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceParentPassword()
            com.flextv.livestore.dlgfragment.LockDlgFragment r1 = com.flextv.livestore.dlgfragment.LockDlgFragment.newInstance(r1)
            r4.lockDlgFragment = r1
            com.flextv.livestore.activities.CategoryActivity$6 r3 = new com.flextv.livestore.activities.CategoryActivity$6
            r3.<init>(r4, r5)
            r1.setOnPinEventListener(r3)
            com.flextv.livestore.dlgfragment.LockDlgFragment r5 = r4.lockDlgFragment
            r5.show(r0, r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L77
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 == r1) goto L74
            r1 = 19
            r2 = 1
            if (r0 == r1) goto L49
            r1 = 20
            if (r0 == r1) goto L17
            goto L77
        L17:
            android.widget.TextView r0 = r3.txt_home
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L3f
            android.widget.TextView r0 = r3.txt_live
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L3f
            android.widget.TextView r0 = r3.txt_movie
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L3f
            android.widget.TextView r0 = r3.txt_series
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L3f
            android.widget.EditText r0 = r3.et_search
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L77
        L3f:
            r4 = 0
            r3.setFocusTopView(r4)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_category
            r4.requestFocus()
            return r2
        L49:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_category
            boolean r0 = r0.hasFocus()
            r1 = 2
            if (r0 == 0) goto L5f
            int r0 = r3.pre_category_pos
            if (r0 >= r1) goto L5f
            r3.setFocusTopView(r2)
            android.widget.TextView r4 = r3.txt_live
            r4.requestFocus()
            return r2
        L5f:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_category
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L77
            int r0 = r3.pre_category_pos
            if (r0 != r1) goto L77
            r3.setFocusTopView(r2)
            android.widget.EditText r4 = r3.et_search
            r4.requestFocus()
            return r2
        L74:
            r3.finish()
        L77:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 0
            java.lang.String r1 = ""
            switch(r3) {
                case 2131428313: goto L3b;
                case 2131428316: goto L2b;
                case 2131428322: goto L1b;
                case 2131428343: goto Lb;
                default: goto La;
            }
        La:
            goto L3e
        Lb:
            com.flextv.livestore.apps.HomeType r3 = com.flextv.livestore.apps.HomeType.series
            com.flextv.livestore.apps.LTVApp.homeType = r3
            r2.setTextColor()
            android.widget.EditText r3 = r2.et_search
            r3.setText(r1)
            r2.setCategoryAdapter(r0)
            goto L3e
        L1b:
            com.flextv.livestore.apps.HomeType r3 = com.flextv.livestore.apps.HomeType.movies
            com.flextv.livestore.apps.LTVApp.homeType = r3
            r2.setTextColor()
            android.widget.EditText r3 = r2.et_search
            r3.setText(r1)
            r2.setCategoryAdapter(r0)
            goto L3e
        L2b:
            com.flextv.livestore.apps.HomeType r3 = com.flextv.livestore.apps.HomeType.live
            com.flextv.livestore.apps.LTVApp.homeType = r3
            r2.setTextColor()
            android.widget.EditText r3 = r2.et_search
            r3.setText(r1)
            r2.setCategoryAdapter(r0)
            goto L3e
        L3b:
            r2.finish()
        L3e:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            r1 = 2131623967(0x7f0e001f, float:1.88751E38)
            r0.setContentView(r1)
            com.flextv.livestore.utils.Utils.FullScreenCall(r0)
            com.flextv.livestore.helper.PreferenceHelper r1 = new com.flextv.livestore.helper.PreferenceHelper
            r1.<init>(r0)
            r0.preferenceHelper = r1
            com.flextv.livestore.models.WordModels r1 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r0)
            r0.wordModels = r1
            r0.initView()
            boolean r1 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r0)
            if (r1 == 0) goto L26
            r1 = 0
            r0.setFocusTopView(r1)
        L26:
            r0.setTextColor()
            int r1 = r0.category_position
            r0.setCategoryAdapter(r1)
            return
    }
}
