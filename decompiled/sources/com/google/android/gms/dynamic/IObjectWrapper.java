package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public interface IObjectWrapper extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IObjectWrapper {
        public Stub() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
                r1.<init>(r0)
                return
        }

        @androidx.annotation.NonNull
        public static com.google.android.gms.dynamic.IObjectWrapper asInterface(@androidx.annotation.NonNull android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof com.google.android.gms.dynamic.IObjectWrapper
                if (r1 == 0) goto L11
                com.google.android.gms.dynamic.IObjectWrapper r0 = (com.google.android.gms.dynamic.IObjectWrapper) r0
                return r0
            L11:
                com.google.android.gms.dynamic.zzb r0 = new com.google.android.gms.dynamic.zzb
                r0.<init>(r2)
                return r0
        }
    }
}
