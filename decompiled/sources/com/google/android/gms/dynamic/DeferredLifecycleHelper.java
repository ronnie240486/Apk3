package com.google.android.gms.dynamic;

import com.google.android.gms.dynamic.LifecycleDelegate;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class DeferredLifecycleHelper<T extends com.google.android.gms.dynamic.LifecycleDelegate> {
    private T zaa;

    @androidx.annotation.Nullable
    private android.os.Bundle zab;
    private java.util.LinkedList<com.google.android.gms.dynamic.zah> zac;
    private final com.google.android.gms.dynamic.OnDelegateCreatedListener<T> zad;

    @com.google.android.gms.common.annotation.KeepForSdk
    public DeferredLifecycleHelper() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.dynamic.zaa r0 = new com.google.android.gms.dynamic.zaa
            r0.<init>(r1)
            r1.zad = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void showGooglePlayUnavailableMessage(@androidx.annotation.NonNull android.widget.FrameLayout r8) {
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            android.content.Context r1 = r8.getContext()
            int r2 = r0.isGooglePlayServicesAvailable(r1)
            java.lang.String r3 = com.google.android.gms.common.internal.zac.zad(r1, r2)
            java.lang.String r4 = com.google.android.gms.common.internal.zac.zac(r1, r2)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r6 = r8.getContext()
            r5.<init>(r6)
            r6 = 1
            r5.setOrientation(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            r5.setLayoutParams(r6)
            r8.addView(r5)
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r8 = r8.getContext()
            r6.<init>(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r7, r7)
            r6.setLayoutParams(r8)
            r6.setText(r3)
            r5.addView(r6)
            r8 = 0
            android.content.Intent r8 = r0.getErrorResolutionIntent(r1, r2, r8)
            if (r8 == 0) goto L6c
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r1)
            r2 = 16908313(0x1020019, float:2.38773E-38)
            r0.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r7, r7)
            r0.setLayoutParams(r2)
            r0.setText(r4)
            r5.addView(r0)
            com.google.android.gms.dynamic.zae r2 = new com.google.android.gms.dynamic.zae
            r2.<init>(r1, r8)
            r0.setOnClickListener(r2)
        L6c:
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.dynamic.LifecycleDelegate zaa(com.google.android.gms.dynamic.DeferredLifecycleHelper r0) {
            T extends com.google.android.gms.dynamic.LifecycleDelegate r0 = r0.zaa
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.LinkedList zab(com.google.android.gms.dynamic.DeferredLifecycleHelper r0) {
            java.util.LinkedList<com.google.android.gms.dynamic.zah> r0 = r0.zac
            return r0
    }

    public static /* bridge */ /* synthetic */ void zac(com.google.android.gms.dynamic.DeferredLifecycleHelper r0, com.google.android.gms.dynamic.LifecycleDelegate r1) {
            r0.zaa = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zad(com.google.android.gms.dynamic.DeferredLifecycleHelper r1) {
            r0 = 0
            r1.zab = r0
            return
    }

    private final void zae(int r2) {
            r1 = this;
        L0:
            java.util.LinkedList<com.google.android.gms.dynamic.zah> r0 = r1.zac
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1c
            java.util.LinkedList<com.google.android.gms.dynamic.zah> r0 = r1.zac
            java.lang.Object r0 = r0.getLast()
            com.google.android.gms.dynamic.zah r0 = (com.google.android.gms.dynamic.zah) r0
            int r0 = r0.zaa()
            if (r0 < r2) goto L1c
            java.util.LinkedList<com.google.android.gms.dynamic.zah> r0 = r1.zac
            r0.removeLast()
            goto L0
        L1c:
            return
    }

    private final void zaf(@androidx.annotation.Nullable android.os.Bundle r2, com.google.android.gms.dynamic.zah r3) {
            r1 = this;
            T extends com.google.android.gms.dynamic.LifecycleDelegate r0 = r1.zaa
            if (r0 == 0) goto L8
            r3.zab(r0)
            return
        L8:
            java.util.LinkedList<com.google.android.gms.dynamic.zah> r0 = r1.zac
            if (r0 != 0) goto L13
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.zac = r0
        L13:
            java.util.LinkedList<com.google.android.gms.dynamic.zah> r0 = r1.zac
            r0.add(r3)
            if (r2 == 0) goto L2a
            android.os.Bundle r3 = r1.zab
            if (r3 != 0) goto L27
            java.lang.Object r2 = r2.clone()
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zab = r2
            goto L2a
        L27:
            r3.putAll(r2)
        L2a:
            r1.createDelegate()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract void createDelegate();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public T getDelegate() {
            r1 = this;
            T extends com.google.android.gms.dynamic.LifecycleDelegate r0 = r1.zaa
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.dynamic.zac r0 = new com.google.android.gms.dynamic.zac
            r0.<init>(r1, r2)
            r1.zaf(r2, r0)
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.view.View onCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r9, @androidx.annotation.Nullable android.view.ViewGroup r10, @androidx.annotation.Nullable android.os.Bundle r11) {
            r8 = this;
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            android.content.Context r0 = r9.getContext()
            r6.<init>(r0)
            com.google.android.gms.dynamic.zad r7 = new com.google.android.gms.dynamic.zad
            r0 = r7
            r1 = r8
            r2 = r6
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r8.zaf(r11, r7)
            T extends com.google.android.gms.dynamic.LifecycleDelegate r9 = r8.zaa
            if (r9 != 0) goto L1e
            showGooglePlayUnavailableMessage(r6)
        L1e:
            return r6
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onDestroy() {
            r1 = this;
            T extends com.google.android.gms.dynamic.LifecycleDelegate r0 = r1.zaa
            if (r0 == 0) goto L8
            r0.onDestroy()
            return
        L8:
            r0 = 1
            r1.zae(r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onDestroyView() {
            r1 = this;
            T extends com.google.android.gms.dynamic.LifecycleDelegate r0 = r1.zaa
            if (r0 == 0) goto L8
            r0.onDestroyView()
            return
        L8:
            r0 = 2
            r1.zae(r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onInflate(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.NonNull android.os.Bundle r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r1 = this;
            com.google.android.gms.dynamic.zab r0 = new com.google.android.gms.dynamic.zab
            r0.<init>(r1, r2, r3, r4)
            r1.zaf(r4, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onLowMemory() {
            r1 = this;
            T extends com.google.android.gms.dynamic.LifecycleDelegate r0 = r1.zaa
            if (r0 == 0) goto L7
            r0.onLowMemory()
        L7:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onPause() {
            r1 = this;
            T extends com.google.android.gms.dynamic.LifecycleDelegate r0 = r1.zaa
            if (r0 == 0) goto L8
            r0.onPause()
            return
        L8:
            r0 = 5
            r1.zae(r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onResume() {
            r2 = this;
            com.google.android.gms.dynamic.zag r0 = new com.google.android.gms.dynamic.zag
            r0.<init>(r2)
            r1 = 0
            r2.zaf(r1, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r2) {
            r1 = this;
            T extends com.google.android.gms.dynamic.LifecycleDelegate r0 = r1.zaa
            if (r0 == 0) goto L8
            r0.onSaveInstanceState(r2)
            return
        L8:
            android.os.Bundle r0 = r1.zab
            if (r0 == 0) goto Lf
            r2.putAll(r0)
        Lf:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onStart() {
            r2 = this;
            com.google.android.gms.dynamic.zaf r0 = new com.google.android.gms.dynamic.zaf
            r0.<init>(r2)
            r1 = 0
            r2.zaf(r1, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onStop() {
            r1 = this;
            T extends com.google.android.gms.dynamic.LifecycleDelegate r0 = r1.zaa
            if (r0 == 0) goto L8
            r0.onStop()
            return
        L8:
            r0 = 4
            r1.zae(r0)
            return
    }
}
