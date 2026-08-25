package com.google.android.material.search;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SearchBar$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ SearchBar$$ExternalSyntheticLambda1(java.lang.Object r1, int r2) {
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
                case 0: goto Le;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.search.SearchViewAnimationHelper r0 = (com.google.android.material.search.SearchViewAnimationHelper) r0
            com.google.android.material.search.SearchViewAnimationHelper.$r8$lambda$dUmgJgHGRv_1TrnG_rLo7h18BfI(r0)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.search.SearchBar r0 = (com.google.android.material.search.SearchBar) r0
            com.google.android.material.search.SearchBar.$r8$lambda$p6NzKwwbHQfO9F5th06TOlM6qLs(r0)
            return
        L16:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.search.SearchViewAnimationHelper r0 = (com.google.android.material.search.SearchViewAnimationHelper) r0
            com.google.android.material.search.SearchViewAnimationHelper.$r8$lambda$wybCWNxxo7ogggXT535_C5NdcUQ(r0)
            return
    }
}
