package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class SupportFragmentWrapper extends com.google.android.gms.dynamic.IFragmentWrapper.Stub {
    private androidx.fragment.app.Fragment zza;

    private SupportFragmentWrapper(androidx.fragment.app.Fragment r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.dynamic.SupportFragmentWrapper wrap(@androidx.annotation.Nullable androidx.fragment.app.Fragment r1) {
            if (r1 == 0) goto L8
            com.google.android.gms.dynamic.SupportFragmentWrapper r0 = new com.google.android.gms.dynamic.SupportFragmentWrapper
            r0.<init>(r1)
            return r0
        L8:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzA() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            boolean r0 = r0.isVisible()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzb() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            int r0 = r0.getId()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzc() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            int r0 = r0.getTargetRequestCode()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @androidx.annotation.Nullable
    public final android.os.Bundle zzd() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            android.os.Bundle r0 = r0.getArguments()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @androidx.annotation.Nullable
    public final com.google.android.gms.dynamic.IFragmentWrapper zze() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            androidx.fragment.app.Fragment r0 = r0.getParentFragment()
            com.google.android.gms.dynamic.SupportFragmentWrapper r0 = wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @androidx.annotation.Nullable
    public final com.google.android.gms.dynamic.IFragmentWrapper zzf() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            androidx.fragment.app.Fragment r0 = r0.getTargetFragment()
            com.google.android.gms.dynamic.SupportFragmentWrapper r0 = wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @androidx.annotation.NonNull
    public final com.google.android.gms.dynamic.IObjectWrapper zzg() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @androidx.annotation.NonNull
    public final com.google.android.gms.dynamic.IObjectWrapper zzh() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            android.content.res.Resources r0 = r0.getResources()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @androidx.annotation.NonNull
    public final com.google.android.gms.dynamic.IObjectWrapper zzi() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            android.view.View r0 = r0.getView()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @androidx.annotation.Nullable
    public final java.lang.String zzj() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            java.lang.String r0 = r0.getTag()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzk(@androidx.annotation.NonNull com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.view.View r2 = (android.view.View) r2
            androidx.fragment.app.Fragment r0 = r1.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r0.registerForContextMenu(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzl(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            r0.setHasOptionsMenu(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzm(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            r0.setMenuVisibility(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzn(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            r0.setRetainInstance(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzo(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            r0.setUserVisibleHint(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzp(@androidx.annotation.NonNull android.content.Intent r2) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            r0.startActivity(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzq(@androidx.annotation.NonNull android.content.Intent r2, int r3) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            r0.startActivityForResult(r2, r3)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzr(@androidx.annotation.NonNull com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.view.View r2 = (android.view.View) r2
            androidx.fragment.app.Fragment r0 = r1.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r0.unregisterForContextMenu(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            boolean r0 = r0.getRetainInstance()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzt() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            boolean r0 = r0.getUserVisibleHint()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzu() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            boolean r0 = r0.isAdded()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzv() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            boolean r0 = r0.isDetached()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzw() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            boolean r0 = r0.isHidden()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzx() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            boolean r0 = r0.isInLayout()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzy() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            boolean r0 = r0.isRemoving()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzz() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.zza
            boolean r0 = r0.isResumed()
            return r0
    }
}
