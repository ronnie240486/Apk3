package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MovieActivity$$ExternalSyntheticLambda0 implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MovieActivity$$ExternalSyntheticLambda0(androidx.appcompat.app.AppCompatActivity r1, int r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r3, int r4) {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L1a;
                case 1: goto L10;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L24
        L6:
            androidx.appcompat.app.AppCompatActivity r0 = r2.f$0
            com.flextv.livestore.activities.MovieSecondActivity r0 = (com.flextv.livestore.activities.MovieSecondActivity) r0
            int r1 = r2.f$1
            com.flextv.livestore.activities.MovieSecondActivity.$r8$lambda$Etr2qbMIUxmkYeUWDMrhgSdLeZw(r0, r1, r3, r4)
            return
        L10:
            androidx.appcompat.app.AppCompatActivity r0 = r2.f$0
            com.flextv.livestore.activities.MovieInfoActivity r0 = (com.flextv.livestore.activities.MovieInfoActivity) r0
            int r1 = r2.f$1
            com.flextv.livestore.activities.MovieInfoActivity.$r8$lambda$wZhf3ft5l1iKh_woXj0gbttRewg(r0, r1, r3, r4)
            return
        L1a:
            androidx.appcompat.app.AppCompatActivity r0 = r2.f$0
            com.flextv.livestore.activities.MovieActivity r0 = (com.flextv.livestore.activities.MovieActivity) r0
            int r1 = r2.f$1
            com.flextv.livestore.activities.MovieActivity.m62$r8$lambda$Q5RZaIzPAOaPPVI1HfB6mEgtN8(r0, r1, r3, r4)
            return
        L24:
            androidx.appcompat.app.AppCompatActivity r0 = r2.f$0
            com.flextv.livestore.activities.SeasonActivity r0 = (com.flextv.livestore.activities.SeasonActivity) r0
            int r1 = r2.f$1
            com.flextv.livestore.activities.SeasonActivity.$r8$lambda$8BTb_Ig74XJF7zL3QBIdwK_KY4g(r0, r1, r3, r4)
            return
    }
}
