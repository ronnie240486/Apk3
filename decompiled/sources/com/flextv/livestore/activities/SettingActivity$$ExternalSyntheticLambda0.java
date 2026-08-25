package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SettingActivity$$ExternalSyntheticLambda0 implements com.flextv.livestore.dlgfragment.ExternalPlayerDlgFragment.ItemPositionListener, com.flextv.livestore.dlgfragment.UpdateDlgFragment.UpdateAvailableListener, com.google.android.play.core.tasks.OnCompleteListener, com.flextv.livestore.dlgfragment.LiveSortDlgFragment.ItemPositionListener, com.flextv.livestore.dlgfragment.NoConnectionDlgFragment.OnRetryClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.flextv.livestore.activities.SettingActivity f$0;

    public /* synthetic */ SettingActivity$$ExternalSyntheticLambda0(com.flextv.livestore.activities.SettingActivity r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.tasks.OnCompleteListener
    public final void onComplete(com.google.android.play.core.tasks.Task r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            goto Lc
        L6:
            com.flextv.livestore.activities.SettingActivity r0 = r1.f$0
            com.flextv.livestore.activities.SettingActivity.m78$r8$lambda$ZjPcH132aK2Cnp09TCRavv8Uw(r0, r2)
            return
        Lc:
            com.flextv.livestore.activities.SettingActivity r0 = r1.f$0
            com.flextv.livestore.activities.SettingActivity.$r8$lambda$Vblds8t7iLAeufTecdBkIp2lphU(r0, r2)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.ExternalPlayerDlgFragment.ItemPositionListener, com.flextv.livestore.dlgfragment.LiveSortDlgFragment.ItemPositionListener
    public final void onItemPosition(int r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L24;
                case 1: goto L1e;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L18;
                case 5: goto L12;
                case 6: goto Lc;
                case 7: goto L5;
                case 8: goto L5;
                case 9: goto L6;
                default: goto L5;
            }
        L5:
            goto L2a
        L6:
            com.flextv.livestore.activities.SettingActivity r0 = r1.f$0
            com.flextv.livestore.activities.SettingActivity.$r8$lambda$4e6FsLzk986sZGB7vGizOenfn0g(r0, r2)
            return
        Lc:
            com.flextv.livestore.activities.SettingActivity r0 = r1.f$0
            com.flextv.livestore.activities.SettingActivity.m75$r8$lambda$3gyp6nTAfIK5xqSOYRYXGgPiAk(r0, r2)
            return
        L12:
            com.flextv.livestore.activities.SettingActivity r0 = r1.f$0
            com.flextv.livestore.activities.SettingActivity.$r8$lambda$FMzLco1PwPNrK6RYUIoFEi9A79I(r0, r2)
            return
        L18:
            com.flextv.livestore.activities.SettingActivity r0 = r1.f$0
            com.flextv.livestore.activities.SettingActivity.m77$r8$lambda$OwVIBvY54P9zPbQVSEpXd01Xa8(r0, r2)
            return
        L1e:
            com.flextv.livestore.activities.SettingActivity r0 = r1.f$0
            com.flextv.livestore.activities.SettingActivity.$r8$lambda$4IIySkxN7zw0o2a_4G9w7NV4fdI(r0, r2)
            return
        L24:
            com.flextv.livestore.activities.SettingActivity r0 = r1.f$0
            com.flextv.livestore.activities.SettingActivity.$r8$lambda$PAwWxyePVbuAlE9yyrdwQ7VXVfM(r0, r2)
            return
        L2a:
            com.flextv.livestore.activities.SettingActivity r0 = r1.f$0
            com.flextv.livestore.activities.SettingActivity.$r8$lambda$EC9NFLkI4D4NuFB5ymgkCTMXcX4(r0, r2)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.NoConnectionDlgFragment.OnRetryClickListener
    public final void onRetryClick() {
            r1 = this;
            com.flextv.livestore.activities.SettingActivity r0 = r1.f$0
            com.flextv.livestore.activities.SettingActivity.m80$r8$lambda$zIXUDWNg_XOfe3J7bGf4aFfXLw(r0)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.UpdateDlgFragment.UpdateAvailableListener
    public final void onUpdateAvailable() {
            r1 = this;
            com.flextv.livestore.activities.SettingActivity r0 = r1.f$0
            com.flextv.livestore.activities.SettingActivity.m79$r8$lambda$dxhQJW_07Lb4goyWWzakEBu3Ng(r0)
            return
    }
}
