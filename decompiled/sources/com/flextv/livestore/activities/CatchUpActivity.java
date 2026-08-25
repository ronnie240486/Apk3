package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes.dex */
public class CatchUpActivity extends androidx.appcompat.app.AppCompatActivity {
    public java.util.List<com.flextv.livestore.models.CatchUpEpg> catchUpEpgList;
    public java.util.List<com.flextv.livestore.models.CatchupModel> catchupModels;
    public android.widget.ImageView channel_image;
    public android.widget.TextView channel_name;
    public java.util.List<com.flextv.livestore.models.CatchUpEpg> currentEventList;
    public com.flextv.livestore.adapter.DateRecyclerAdapter dateAdapter;
    public com.flextv.livestore.view.LiveVerticalGridView date_list;
    public int date_pos;
    public int epg_focus_pos;
    public com.flextv.livestore.view.LiveVerticalGridView epg_list;
    public android.widget.ImageButton image_back;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.adapter.ProgramRecyclerAdapter programAdapter;
    public int program_pos;
    public android.widget.ProgressBar progressBar;
    public com.flextv.livestore.models.EPGChannel selectedChannel;
    public java.text.SimpleDateFormat simpleDateFormat;
    public android.widget.TextView txt_catch;
    public java.text.SimpleDateFormat weekFormat;
    public com.flextv.livestore.models.WordModels wordModels;




    public static /* synthetic */ kotlin.Unit $r8$lambda$cl1yDTnfj9Ckqgs2nxvZ_VEpOJM(com.flextv.livestore.activities.CatchUpActivity r0, com.flextv.livestore.models.CatchupModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreate$0(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$hgifK7m8-Z5rCermEmO7qpQZGKc, reason: not valid java name */
    public static /* synthetic */ void m47$r8$lambda$hgifK7m8Z5rCermEmO7qpQZGKc(com.flextv.livestore.activities.CatchUpActivity r0, android.view.View r1) {
            r0.lambda$initView$2(r1)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ybKdPqYL8VSZkUNG0n_mji9zJ8M(com.flextv.livestore.activities.CatchUpActivity r0, com.flextv.livestore.models.CatchUpEpg r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreate$1(r1, r2, r3)
            return r0
    }

    public CatchUpActivity() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.date_pos = r0
            r2.program_pos = r0
            r2.epg_focus_pos = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "MMM d"
            r0.<init>(r1)
            r2.simpleDateFormat = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "EEEE"
            r0.<init>(r1)
            r2.weekFormat = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r2.wordModels = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.activities.CatchUpActivity r0, java.util.List r1) {
            r0.getCatchupModels(r1)
            return
    }

    private void getCatchupModels(java.util.List<com.flextv.livestore.models.CatchUpEpg> r13) {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.catchupModels = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r13.iterator()
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = 0
        L14:
            boolean r6 = r1.hasNext()
            r7 = 1
            if (r6 == 0) goto La1
            java.lang.Object r6 = r1.next()
            com.flextv.livestore.models.CatchUpEpg r6 = (com.flextv.livestore.models.CatchUpEpg) r6
            int r5 = r5 + r7
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            long r8 = r6.getStart_timestamp()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            r7.setTimeInMillis(r8)
            java.text.SimpleDateFormat r8 = r12.simpleDateFormat
            java.util.Date r9 = r7.getTime()
            java.lang.String r8 = r8.format(r9)
            if (r2 != 0) goto L4d
            java.text.SimpleDateFormat r0 = r12.weekFormat
            java.util.Date r2 = r7.getTime()
            java.lang.String r4 = r0.format(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = r8
        L4d:
            boolean r9 = r8.equals(r2)
            if (r9 != 0) goto L78
            com.flextv.livestore.models.CatchupModel r9 = new com.flextv.livestore.models.CatchupModel
            r9.<init>()
            r9.setName(r2)
            r9.setDayofweek(r4)
            r9.setEpgEvents(r0)
            java.util.List<com.flextv.livestore.models.CatchupModel> r0 = r12.catchupModels
            r0.add(r9)
            java.text.SimpleDateFormat r0 = r12.weekFormat
            java.util.Date r2 = r7.getTime()
            java.lang.String r0 = r0.format(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = r0
            r0 = r2
            r2 = r8
        L78:
            r0.add(r6)
            int r6 = r13.size()
            if (r5 != r6) goto L14
            com.flextv.livestore.models.CatchupModel r4 = new com.flextv.livestore.models.CatchupModel
            r4.<init>()
            r4.setName(r2)
            java.text.SimpleDateFormat r6 = r12.weekFormat
            java.util.Date r7 = r7.getTime()
            java.lang.String r6 = r6.format(r7)
            r4.setDayofweek(r6)
            r4.setEpgEvents(r0)
            java.util.List<com.flextv.livestore.models.CatchupModel> r7 = r12.catchupModels
            r7.add(r4)
            r4 = r6
            goto L14
        La1:
            android.widget.ProgressBar r13 = r12.progressBar
            r0 = 8
            r13.setVisibility(r0)
            java.util.List<com.flextv.livestore.models.CatchupModel> r13 = r12.catchupModels
            int r13 = r13.size()
            if (r13 <= 0) goto L11a
            java.util.List<com.flextv.livestore.models.CatchupModel> r13 = r12.catchupModels
            int r13 = r12.getCurrentDatePosition(r13)
            r12.date_pos = r13
            com.flextv.livestore.adapter.DateRecyclerAdapter r0 = r12.dateAdapter
            java.util.List<com.flextv.livestore.models.CatchupModel> r1 = r12.catchupModels
            r0.setCatchupModels(r1, r13)
            java.util.List<com.flextv.livestore.models.CatchupModel> r13 = r12.catchupModels
            int r0 = r12.date_pos
            java.lang.Object r13 = r13.get(r0)
            com.flextv.livestore.models.CatchupModel r13 = (com.flextv.livestore.models.CatchupModel) r13
            java.util.List r13 = r13.getEpgEvents()
            r12.currentEventList = r13
            r13 = -1
            r0 = 0
            r1 = -1
        Ld2:
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r2 = r12.currentEventList
            int r2 = r2.size()
            if (r0 >= r2) goto Lec
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r2 = r12.currentEventList
            java.lang.Object r2 = r2.get(r0)
            com.flextv.livestore.models.CatchUpEpg r2 = (com.flextv.livestore.models.CatchUpEpg) r2
            int r2 = r2.getNow_playing()
            if (r2 != r7) goto Le9
            r1 = r0
        Le9:
            int r0 = r0 + 1
            goto Ld2
        Lec:
            if (r1 != r13) goto Lf1
            r12.program_pos = r3
            goto Lf3
        Lf1:
            r12.program_pos = r1
        Lf3:
            com.flextv.livestore.adapter.ProgramRecyclerAdapter r13 = r12.programAdapter
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r0 = r12.currentEventList
            r13.setProgramList(r0)
            com.flextv.livestore.view.LiveVerticalGridView r13 = r12.epg_list
            int r0 = r12.program_pos
            r13.setSelectedPosition(r0)
            com.flextv.livestore.adapter.ProgramRecyclerAdapter r13 = r12.programAdapter
            int r0 = r12.program_pos
            r13.setFocusDisable(r0, r3)
            com.flextv.livestore.adapter.ProgramRecyclerAdapter r13 = r12.programAdapter
            r13.setCurrentProgramPosition(r1)
            com.flextv.livestore.view.LiveVerticalGridView r13 = r12.date_list
            r13.requestFocus()
            com.flextv.livestore.view.LiveVerticalGridView r13 = r12.date_list
            int r0 = r12.date_pos
            r13.setSelectedPosition(r0)
            goto L127
        L11a:
            com.flextv.livestore.models.WordModels r13 = r12.wordModels
            java.lang.String r13 = r13.getNo_epg_avaliable()
            android.widget.Toast r13 = android.widget.Toast.makeText(r12, r13, r3)
            r13.show()
        L127:
            return
    }

    private int getCurrentDatePosition(java.util.List<com.flextv.livestore.models.CatchupModel> r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.size()
            if (r1 >= r2) goto L27
            java.text.SimpleDateFormat r2 = r4.simpleDateFormat
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.String r2 = r2.format(r3)
            java.lang.Object r3 = r5.get(r1)
            com.flextv.livestore.models.CatchupModel r3 = (com.flextv.livestore.models.CatchupModel) r3
            java.lang.String r3 = r3.getName()
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L24
            return r1
        L24:
            int r1 = r1 + 1
            goto L2
        L27:
            return r0
    }

    private void getEpg() {
            r5 = this;
            android.widget.ProgressBar r0 = r5.progressBar
            r1 = 0
            r0.setVisibility(r1)
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = r0.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L2f
            com.flextv.livestore.remote.APIService r0 = com.flextv.livestore.remote.RetroClass.getAPIService(r0)     // Catch: java.lang.Exception -> L2f
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = r2.getSharedPreferenceUsername()     // Catch: java.lang.Exception -> L2f
            com.flextv.livestore.helper.PreferenceHelper r3 = r5.preferenceHelper     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = r3.getSharedPreferencePassword()     // Catch: java.lang.Exception -> L2f
            com.flextv.livestore.models.EPGChannel r4 = r5.selectedChannel     // Catch: java.lang.Exception -> L2f
            java.lang.String r4 = r4.getStream_id()     // Catch: java.lang.Exception -> L2f
            retrofit2.Call r0 = r0.get_full_epg(r2, r3, r4)     // Catch: java.lang.Exception -> L2f
            com.flextv.livestore.activities.CatchUpActivity$1 r2 = new com.flextv.livestore.activities.CatchUpActivity$1     // Catch: java.lang.Exception -> L2f
            r2.<init>(r5)     // Catch: java.lang.Exception -> L2f
            r0.enqueue(r2)     // Catch: java.lang.Exception -> L2f
            goto L55
        L2f:
            com.flextv.livestore.models.WordModels r0 = r5.wordModels
            java.lang.String r0 = r0.getNo_epg_avaliable()
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r1)
            r0.show()
            android.widget.ProgressBar r0 = r5.progressBar
            r1 = 8
            r0.setVisibility(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.catchUpEpgList = r0
            android.widget.ImageButton r0 = r5.image_back
            r1 = 1
            r0.setFocusable(r1)
            android.widget.ImageButton r0 = r5.image_back
            r0.requestFocus()
        L55:
            return
    }

    private void goToLivePage() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "is_changed"
            java.lang.String r2 = ""
            r0.putExtra(r1, r2)
            r1 = -1
            r3.setResult(r1, r0)
            r3.finish()
            return
    }

    private void initView() {
            r6 = this;
            r0 = 2131427514(0x7f0b00ba, float:1.8476646E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.channel_image = r0
            r0 = 2131427516(0x7f0b00bc, float:1.847665E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.channel_name = r0
            r0 = 2131427557(0x7f0b00e5, float:1.8476734E38)
            android.view.View r0 = r6.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r6.date_list = r0
            r0 = 2131427620(0x7f0b0124, float:1.8476861E38)
            android.view.View r0 = r6.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r6.epg_list = r0
            r0 = 2131428287(0x7f0b03bf, float:1.8478214E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.txt_catch = r0
            r0 = 2131427707(0x7f0b017b, float:1.8477038E38)
            android.view.View r0 = r6.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 2131428066(0x7f0b02e2, float:1.8477766E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r6.progressBar = r0
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131427781(0x7f0b01c5, float:1.8477188E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r6.image_back = r0
            r1 = 0
            r0.setFocusable(r1)
            android.widget.ImageButton r0 = r6.image_back
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r3 = 1
            r2.<init>(r6, r3)
            r0.setOnClickListener(r2)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.date_list
            r0.setNumColumns(r3)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.date_list
            r0.setLoop(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.date_list
            r0.setPreserveFocusAfterLayout(r3)
            android.view.View[] r0 = new android.view.View[r3]
            r2 = 0
            r0[r1] = r2
            com.flextv.livestore.view.LiveVerticalGridView r4 = r6.date_list
            com.flextv.livestore.activities.CatchUpActivity$2 r5 = new com.flextv.livestore.activities.CatchUpActivity$2
            r5.<init>(r0)
            r4.setOnChildViewHolderSelectedListener(r5)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.epg_list
            r0.setNumColumns(r3)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.epg_list
            r0.setPreserveFocusAfterLayout(r3)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.epg_list
            r0.setLoop(r1)
            android.view.View[] r0 = new android.view.View[r3]
            r0[r1] = r2
            com.flextv.livestore.view.LiveVerticalGridView r1 = r6.epg_list
            com.flextv.livestore.activities.CatchUpActivity$3 r2 = new com.flextv.livestore.activities.CatchUpActivity$3
            r2.<init>(r0)
            r1.setOnChildViewHolderSelectedListener(r2)
            android.widget.TextView r0 = r6.txt_catch
            com.flextv.livestore.models.WordModels r1 = r6.wordModels
            java.lang.String r1 = r1.getCatch_up()
            r0.setText(r1)
            return
    }

    private /* synthetic */ void lambda$initView$2(android.view.View r1) {
            r0 = this;
            r0.goToLivePage()
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreate$0(com.flextv.livestore.models.CatchupModel r5, java.lang.Integer r6, java.lang.Boolean r7) {
            r4 = this;
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L4c
            java.util.List r5 = r5.getEpgEvents()
            r4.currentEventList = r5
            r5 = -1
            r7 = 0
            r0 = 0
            r1 = -1
        L10:
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r2 = r4.currentEventList
            int r2 = r2.size()
            if (r0 >= r2) goto L2b
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r2 = r4.currentEventList
            java.lang.Object r2 = r2.get(r0)
            com.flextv.livestore.models.CatchUpEpg r2 = (com.flextv.livestore.models.CatchUpEpg) r2
            int r2 = r2.getNow_playing()
            r3 = 1
            if (r2 != r3) goto L28
            r1 = r0
        L28:
            int r0 = r0 + 1
            goto L10
        L2b:
            if (r1 != r5) goto L30
            r4.program_pos = r7
            goto L32
        L30:
            r4.program_pos = r1
        L32:
            com.flextv.livestore.adapter.ProgramRecyclerAdapter r5 = r4.programAdapter
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r0 = r4.currentEventList
            r5.setProgramList(r0)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.epg_list
            int r0 = r4.program_pos
            r5.setSelectedPosition(r0)
            com.flextv.livestore.adapter.ProgramRecyclerAdapter r5 = r4.programAdapter
            int r0 = r4.program_pos
            r5.setFocusDisable(r0, r7)
            com.flextv.livestore.adapter.ProgramRecyclerAdapter r5 = r4.programAdapter
            r5.setCurrentProgramPosition(r1)
        L4c:
            int r5 = r6.intValue()
            r4.date_pos = r5
            r5 = 0
            return r5
    }

    private /* synthetic */ kotlin.Unit lambda$onCreate$1(com.flextv.livestore.models.CatchUpEpg r2, java.lang.Integer r3, java.lang.Boolean r4) {
            r1 = this;
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L43
            int r2 = r2.getHas_archive()
            r4 = 1
            if (r2 != r4) goto L39
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.CatchUpPlayerActivity> r4 = com.flextv.livestore.activities.CatchUpPlayerActivity.class
            r2.<init>(r1, r4)
            java.lang.String r4 = "position"
            r2.putExtra(r4, r3)
            com.flextv.livestore.models.EPGChannel r4 = r1.selectedChannel
            java.lang.String r4 = r4.getStream_id()
            java.lang.String r0 = "stream_id"
            r2.putExtra(r0, r4)
            com.google.gson.Gson r4 = new com.google.gson.Gson
            r4.<init>()
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r0 = r1.currentEventList
            java.lang.String r4 = r4.toJson(r0)
            java.lang.String r0 = "epg_model"
            r2.putExtra(r0, r4)
            r1.startActivity(r2)
            goto L43
        L39:
            r2 = 0
            java.lang.String r4 = "This program can not be play"
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r4, r2)
            r2.show()
        L43:
            int r2 = r3.intValue()
            r1.epg_focus_pos = r2
            r2 = 0
            return r2
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
            r4 = this;
            int r0 = r5.getAction()
            if (r0 != 0) goto L7e
            int r0 = r5.getKeyCode()
            r1 = 4
            r2 = 1
            if (r0 == r1) goto L7a
            r1 = 22
            r3 = 0
            if (r0 == r1) goto L5d
            r1 = 19
            if (r0 == r1) goto L2f
            r1 = 20
            if (r0 == r1) goto L1c
            goto L7e
        L1c:
            android.widget.ImageButton r0 = r4.image_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L7e
            android.widget.ImageButton r5 = r4.image_back
            r5.setFocusable(r3)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.date_list
            r5.requestFocus()
            return r2
        L2f:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.date_list
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L46
            int r0 = r4.date_pos
            if (r0 != 0) goto L46
            android.widget.ImageButton r5 = r4.image_back
            r5.setFocusable(r2)
            android.widget.ImageButton r5 = r4.image_back
            r5.requestFocus()
            return r2
        L46:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.epg_list
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L7e
            int r0 = r4.epg_focus_pos
            if (r0 != 0) goto L7e
            android.widget.ImageButton r5 = r4.image_back
            r5.setFocusable(r2)
            android.widget.ImageButton r5 = r4.image_back
            r5.requestFocus()
            return r2
        L5d:
            android.widget.ImageButton r0 = r4.image_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L7e
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r0 = r4.currentEventList
            if (r0 == 0) goto L7e
            int r0 = r0.size()
            if (r0 <= 0) goto L7e
            android.widget.ImageButton r5 = r4.image_back
            r5.setFocusable(r3)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.epg_list
            r5.requestFocus()
            return r2
        L7a:
            r4.goToLivePage()
            return r2
        L7e:
            boolean r5 = super.dispatchKeyEvent(r5)
            return r5
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            r4 = 2131623965(0x7f0e001d, float:1.8875096E38)
            r3.setContentView(r4)
            com.flextv.livestore.utils.Utils.FullScreenCall(r3)
            com.flextv.livestore.helper.PreferenceHelper r4 = new com.flextv.livestore.helper.PreferenceHelper
            r4.<init>(r3)
            r3.preferenceHelper = r4
            com.flextv.livestore.models.WordModels r4 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r3)
            r3.wordModels = r4
            r3.initView()
            com.flextv.livestore.helper.RealmController r4 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = com.flextv.livestore.apps.LTVApp.channelName
            com.flextv.livestore.models.EPGChannel r4 = r4.getEpgChannelByName(r0)
            r3.selectedChannel = r4
            android.widget.TextView r4 = r3.channel_name
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.flextv.livestore.models.EPGChannel r1 = r3.selectedChannel
            java.lang.String r1 = r1.getNum()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            com.flextv.livestore.models.EPGChannel r1 = r3.selectedChannel
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.setText(r0)
            r4 = 2131230987(0x7f08010b, float:1.8078042E38)
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r3)     // Catch: java.lang.Exception -> L6b
            com.flextv.livestore.models.EPGChannel r1 = r3.selectedChannel     // Catch: java.lang.Exception -> L6b
            java.lang.String r1 = r1.getStream_icon()     // Catch: java.lang.Exception -> L6b
            com.bumptech.glide.RequestBuilder r0 = r0.load(r1)     // Catch: java.lang.Exception -> L6b
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.error(r4)     // Catch: java.lang.Exception -> L6b
            com.bumptech.glide.RequestBuilder r0 = (com.bumptech.glide.RequestBuilder) r0     // Catch: java.lang.Exception -> L6b
            android.widget.ImageView r1 = r3.channel_image     // Catch: java.lang.Exception -> L6b
            r0.into(r1)     // Catch: java.lang.Exception -> L6b
            goto L82
        L6b:
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            com.bumptech.glide.RequestBuilder r0 = r0.load(r1)
            com.bumptech.glide.request.BaseRequestOptions r4 = r0.error(r4)
            com.bumptech.glide.RequestBuilder r4 = (com.bumptech.glide.RequestBuilder) r4
            android.widget.ImageView r0 = r3.channel_image
            r4.into(r0)
        L82:
            com.flextv.livestore.adapter.DateRecyclerAdapter r4 = new com.flextv.livestore.adapter.DateRecyclerAdapter
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.activities.CatchUpActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.CatchUpActivity$$ExternalSyntheticLambda0
            r2 = 0
            r1.<init>(r3, r2)
            r4.<init>(r3, r0, r1)
            r3.dateAdapter = r4
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.date_list
            r0.setAdapter(r4)
            com.flextv.livestore.adapter.ProgramRecyclerAdapter r4 = new com.flextv.livestore.adapter.ProgramRecyclerAdapter
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.activities.CatchUpActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.CatchUpActivity$$ExternalSyntheticLambda0
            r2 = 1
            r1.<init>(r3, r2)
            r4.<init>(r3, r0, r1)
            r3.programAdapter = r4
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.epg_list
            r0.setAdapter(r4)
            r3.getEpg()
            return
    }
}
