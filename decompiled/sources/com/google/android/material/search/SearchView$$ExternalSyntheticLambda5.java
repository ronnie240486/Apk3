package com.google.android.material.search;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SearchView$$ExternalSyntheticLambda5 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.material.search.SearchView f$0;

    public /* synthetic */ SearchView$$ExternalSyntheticLambda5(com.google.android.material.search.SearchView r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Lc;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            com.google.android.material.search.SearchView r0 = r1.f$0
            com.google.android.material.search.SearchView.$r8$lambda$ZZAFRAxyb5ToA7OY2fYaS_PRayA(r0)
            return
        Lc:
            com.google.android.material.search.SearchView r0 = r1.f$0
            com.google.android.material.search.SearchView.m287$r8$lambda$ExPaTI05NZan8hRAbY4u_gxOYk(r0)
            return
        L12:
            com.google.android.material.search.SearchView r0 = r1.f$0
            r0.requestFocusAndShowKeyboardIfNeeded()
            return
    }
}
