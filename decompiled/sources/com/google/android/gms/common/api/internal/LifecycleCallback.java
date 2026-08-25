package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class LifecycleCallback {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final com.google.android.gms.common.api.internal.LifecycleFragment mLifecycleFragment;

    @com.google.android.gms.common.annotation.KeepForSdk
    public LifecycleCallback(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.LifecycleFragment r1) {
            r0 = this;
            r0.<init>()
            r0.mLifecycleFragment = r1
            return
    }

    @androidx.annotation.Keep
    private static com.google.android.gms.common.api.internal.LifecycleFragment getChimeraLifecycleFragmentImpl(com.google.android.gms.common.api.internal.LifecycleActivity r1) {
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Method not available in SDK."
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(@androidx.annotation.NonNull android.app.Activity r1) {
            com.google.android.gms.common.api.internal.LifecycleActivity r0 = new com.google.android.gms.common.api.internal.LifecycleActivity
            r0.<init>(r1)
            com.google.android.gms.common.api.internal.LifecycleFragment r1 = getFragment(r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(@androidx.annotation.NonNull android.content.ContextWrapper r0) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.LifecycleActivity r1) {
            boolean r0 = r1.zzd()
            if (r0 == 0) goto Lf
            androidx.fragment.app.FragmentActivity r1 = r1.zzb()
            com.google.android.gms.common.api.internal.zzd r1 = com.google.android.gms.common.api.internal.zzd.zzc(r1)
            return r1
        Lf:
            boolean r0 = r1.zzc()
            if (r0 == 0) goto L1e
            android.app.Activity r1 = r1.zza()
            com.google.android.gms.common.api.internal.zzb r1 = com.google.android.gms.common.api.internal.zzb.zzc(r1)
            return r1
        L1e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't get fragment for unexpected activity."
            r1.<init>(r0)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.MainThread
    public void dump(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.io.FileDescriptor r2, @androidx.annotation.NonNull java.io.PrintWriter r3, @androidx.annotation.NonNull java.lang.String[] r4) {
            r0 = this;
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.app.Activity getActivity() {
            r1 = this;
            com.google.android.gms.common.api.internal.LifecycleFragment r0 = r1.mLifecycleFragment
            android.app.Activity r0 = r0.getLifecycleActivity()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.MainThread
    public void onActivityResult(int r1, int r2, @androidx.annotation.NonNull android.content.Intent r3) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.MainThread
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.MainThread
    public void onDestroy() {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.MainThread
    public void onResume() {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.MainThread
    public void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r1) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.MainThread
    public void onStart() {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.MainThread
    public void onStop() {
            r0 = this;
            return
    }
}
