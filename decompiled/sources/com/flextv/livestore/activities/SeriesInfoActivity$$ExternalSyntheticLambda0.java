package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SeriesInfoActivity$$ExternalSyntheticLambda0 implements com.android.volley.Response.Listener, com.flextv.livestore.helper.RealmChangeItemListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.flextv.livestore.activities.SeriesInfoActivity f$0;

    public /* synthetic */ SeriesInfoActivity$$ExternalSyntheticLambda0(com.flextv.livestore.activities.SeriesInfoActivity r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.flextv.livestore.helper.RealmChangeItemListener
    public final void onItemChanged() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto Lc
        L6:
            com.flextv.livestore.activities.SeriesInfoActivity r0 = r1.f$0
            com.flextv.livestore.activities.SeriesInfoActivity.$r8$lambda$xsJq6Gthy1jov2ZxFJp4h_PyZyg(r0)
            return
        Lc:
            com.flextv.livestore.activities.SeriesInfoActivity r0 = r1.f$0
            com.flextv.livestore.activities.SeriesInfoActivity.$r8$lambda$sfrPvRd1nN75cKsFvLmVyVWwNQs(r0)
            return
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.activities.SeriesInfoActivity r0 = r1.f$0
            java.lang.String r2 = (java.lang.String) r2
            com.flextv.livestore.activities.SeriesInfoActivity.$r8$lambda$Rrt_A_pHfY6wxbz_2df8DkCtWQ0(r0, r2)
            return
    }
}
