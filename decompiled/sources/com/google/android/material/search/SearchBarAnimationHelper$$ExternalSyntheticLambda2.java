package com.google.android.material.search;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SearchBarAnimationHelper$$ExternalSyntheticLambda2 implements com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation {
    public static final /* synthetic */ com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2 INSTANCE = null;
    public static final /* synthetic */ com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2 INSTANCE$1 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2 r0 = new com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2
            r1 = 0
            r0.<init>(r1)
            com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2.INSTANCE = r0
            com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2 r0 = new com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2
            r1 = 1
            r0.<init>(r1)
            com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2.INSTANCE$1 = r0
            return
    }

    public /* synthetic */ SearchBarAnimationHelper$$ExternalSyntheticLambda2(int r1) {
            r0 = this;
            r0.$r8$classId = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
    public final void invoke(com.google.android.material.search.SearchBar.OnLoadAnimationCallback r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto La
        L6:
            r2.onAnimationStart()
            return
        La:
            r2.onAnimationEnd()
            return
    }
}
