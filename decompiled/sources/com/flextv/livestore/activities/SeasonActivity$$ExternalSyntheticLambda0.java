package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SeasonActivity$$ExternalSyntheticLambda0 implements com.android.volley.Response.Listener, com.android.volley.Response.ErrorListener, com.flextv.livestore.helper.RealmChangeItemListener {
    public final /* synthetic */ com.flextv.livestore.activities.SeasonActivity f$0;

    public /* synthetic */ SeasonActivity$$ExternalSyntheticLambda0(com.flextv.livestore.activities.SeasonActivity r1) {
            r0 = this;
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(com.android.volley.VolleyError r2) {
            r1 = this;
            com.flextv.livestore.activities.SeasonActivity r0 = r1.f$0
            com.flextv.livestore.activities.SeasonActivity.$r8$lambda$ZtLBSp9aDo9dzIsgYHnAblD8qA8(r0, r2)
            return
    }

    @Override // com.flextv.livestore.helper.RealmChangeItemListener
    public final void onItemChanged() {
            r1 = this;
            com.flextv.livestore.activities.SeasonActivity r0 = r1.f$0
            com.flextv.livestore.activities.SeasonActivity.$r8$lambda$MxPtSlIzzLPkLyt9jAKW6C7eloQ(r0)
            return
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.activities.SeasonActivity r0 = r1.f$0
            java.lang.String r2 = (java.lang.String) r2
            com.flextv.livestore.activities.SeasonActivity.m69$r8$lambda$h7mlFB8GDjOdqCR1bdK44mK818(r0, r2)
            return
    }
}
