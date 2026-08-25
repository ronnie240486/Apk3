package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public interface ICancelToken extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.ICancelToken {
        public Stub() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.common.internal.ICancelToken"
                r1.<init>(r0)
                return
        }

        @androidx.annotation.NonNull
        public static com.google.android.gms.common.internal.ICancelToken asInterface(@androidx.annotation.NonNull android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.common.internal.ICancelToken"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof com.google.android.gms.common.internal.ICancelToken
                if (r1 == 0) goto L11
                com.google.android.gms.common.internal.ICancelToken r0 = (com.google.android.gms.common.internal.ICancelToken) r0
                return r0
            L11:
                com.google.android.gms.common.internal.zzw r0 = new com.google.android.gms.common.internal.zzw
                r0.<init>(r2)
                return r0
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int r1, @androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.NonNull android.os.Parcel r3) throws android.os.RemoteException {
                r0 = this;
                r2 = 2
                if (r1 != r2) goto L8
                r0.cancel()
                r1 = 1
                return r1
            L8:
                r1 = 0
                return r1
        }
    }

    void cancel() throws android.os.RemoteException;
}
