package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MovieActivity$1$$ExternalSyntheticLambda0 implements com.flextv.livestore.helper.RealmChangeItemListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.flextv.livestore.activities.MovieActivity.AnonymousClass1 f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MovieActivity$1$$ExternalSyntheticLambda0(com.flextv.livestore.activities.MovieActivity.AnonymousClass1 r1, int r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // com.flextv.livestore.helper.RealmChangeItemListener
    public final void onItemChanged() {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            com.flextv.livestore.activities.MovieActivity$1 r0 = r2.f$0
            int r1 = r2.f$1
            com.flextv.livestore.activities.MovieActivity.AnonymousClass1.$r8$lambda$N12YHZqY5QgzX2qDzPRqQy6gBn8(r0, r1)
            return
        Le:
            com.flextv.livestore.activities.MovieActivity$1 r0 = r2.f$0
            int r1 = r2.f$1
            com.flextv.livestore.activities.MovieActivity.AnonymousClass1.$r8$lambda$eiYUV6tZQcqe0LXRMomYXaVW8rY(r0, r1)
            return
    }
}
