package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MovieActivity$$ExternalSyntheticLambda1 implements android.content.DialogInterface.OnClickListener {
    public static final /* synthetic */ com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1 INSTANCE = null;
    public static final /* synthetic */ com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1 INSTANCE$1 = null;
    public static final /* synthetic */ com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1 INSTANCE$2 = null;
    public static final /* synthetic */ com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1 INSTANCE$3 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1 r0 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1
            r1 = 0
            r0.<init>(r1)
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1.INSTANCE = r0
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1 r0 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1
            r1 = 1
            r0.<init>(r1)
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1.INSTANCE$1 = r0
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1 r0 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1
            r1 = 2
            r0.<init>(r1)
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1.INSTANCE$2 = r0
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1 r0 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1
            r1 = 3
            r0.<init>(r1)
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1.INSTANCE$3 = r0
            return
    }

    public /* synthetic */ MovieActivity$$ExternalSyntheticLambda1(int r1) {
            r0 = this;
            r0.$r8$classId = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Le;
                case 1: goto La;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            com.flextv.livestore.activities.MovieSecondActivity.m65$r8$lambda$aTbt9RYgzU5Hvomdtk9xOUPcw(r2, r3)
            return
        La:
            com.flextv.livestore.activities.MovieInfoActivity.$r8$lambda$n87hTRKUK59tXglv2jm7mrK6rbQ(r2, r3)
            return
        Le:
            com.flextv.livestore.activities.MovieActivity.m61$r8$lambda$937lgqBLqNnde69Y6PxlouLpVc(r2, r3)
            return
        L12:
            com.flextv.livestore.activities.SeasonActivity.m67$r8$lambda$SJt6mEFfieBR19inDTFq3vk9P4(r2, r3)
            return
    }
}
