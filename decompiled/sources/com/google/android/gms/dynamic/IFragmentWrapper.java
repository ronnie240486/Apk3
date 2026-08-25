package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface IFragmentWrapper extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IFragmentWrapper {
        public Stub() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r1.<init>(r0)
                return
        }

        @androidx.annotation.NonNull
        public static com.google.android.gms.dynamic.IFragmentWrapper asInterface(@androidx.annotation.NonNull android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof com.google.android.gms.dynamic.IFragmentWrapper
                if (r1 == 0) goto L11
                com.google.android.gms.dynamic.IFragmentWrapper r0 = (com.google.android.gms.dynamic.IFragmentWrapper) r0
                return r0
            L11:
                com.google.android.gms.dynamic.zza r0 = new com.google.android.gms.dynamic.zza
                r0.<init>(r2)
                return r0
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int r1, @androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.NonNull android.os.Parcel r3) throws android.os.RemoteException {
                r0 = this;
                switch(r1) {
                    case 2: goto L13c;
                    case 3: goto L131;
                    case 4: goto L126;
                    case 5: goto L11b;
                    case 6: goto L110;
                    case 7: goto L105;
                    case 8: goto Lfa;
                    case 9: goto Lef;
                    case 10: goto Le4;
                    case 11: goto Ld9;
                    case 12: goto Lcd;
                    case 13: goto Lc1;
                    case 14: goto Lb5;
                    case 15: goto La9;
                    case 16: goto L9d;
                    case 17: goto L91;
                    case 18: goto L85;
                    case 19: goto L79;
                    case 20: goto L69;
                    case 21: goto L5d;
                    case 22: goto L51;
                    case 23: goto L45;
                    case 24: goto L39;
                    case 25: goto L29;
                    case 26: goto L15;
                    case 27: goto L5;
                    default: goto L3;
                }
            L3:
                r1 = 0
                return r1
            L5:
                android.os.IBinder r1 = r2.readStrongBinder()
                com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
                r0.zzr(r1)
                r3.writeNoException()
                goto L146
            L15:
                android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
                android.os.Parcelable r1 = com.google.android.gms.internal.common.zzc.zza(r2, r1)
                android.content.Intent r1 = (android.content.Intent) r1
                int r2 = r2.readInt()
                r0.zzq(r1, r2)
                r3.writeNoException()
                goto L146
            L29:
                android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
                android.os.Parcelable r1 = com.google.android.gms.internal.common.zzc.zza(r2, r1)
                android.content.Intent r1 = (android.content.Intent) r1
                r0.zzp(r1)
                r3.writeNoException()
                goto L146
            L39:
                boolean r1 = com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzo(r1)
                r3.writeNoException()
                goto L146
            L45:
                boolean r1 = com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzn(r1)
                r3.writeNoException()
                goto L146
            L51:
                boolean r1 = com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzm(r1)
                r3.writeNoException()
                goto L146
            L5d:
                boolean r1 = com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzl(r1)
                r3.writeNoException()
                goto L146
            L69:
                android.os.IBinder r1 = r2.readStrongBinder()
                com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
                r0.zzk(r1)
                r3.writeNoException()
                goto L146
            L79:
                boolean r1 = r0.zzA()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzb(r3, r1)
                goto L146
            L85:
                boolean r1 = r0.zzz()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzb(r3, r1)
                goto L146
            L91:
                boolean r1 = r0.zzy()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzb(r3, r1)
                goto L146
            L9d:
                boolean r1 = r0.zzx()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzb(r3, r1)
                goto L146
            La9:
                boolean r1 = r0.zzw()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzb(r3, r1)
                goto L146
            Lb5:
                boolean r1 = r0.zzv()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzb(r3, r1)
                goto L146
            Lc1:
                boolean r1 = r0.zzu()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzb(r3, r1)
                goto L146
            Lcd:
                com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzi()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zze(r3, r1)
                goto L146
            Ld9:
                boolean r1 = r0.zzt()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzb(r3, r1)
                goto L146
            Le4:
                int r1 = r0.zzc()
                r3.writeNoException()
                r3.writeInt(r1)
                goto L146
            Lef:
                com.google.android.gms.dynamic.IFragmentWrapper r1 = r0.zzf()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zze(r3, r1)
                goto L146
            Lfa:
                java.lang.String r1 = r0.zzj()
                r3.writeNoException()
                r3.writeString(r1)
                goto L146
            L105:
                boolean r1 = r0.zzs()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzb(r3, r1)
                goto L146
            L110:
                com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzh()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zze(r3, r1)
                goto L146
            L11b:
                com.google.android.gms.dynamic.IFragmentWrapper r1 = r0.zze()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zze(r3, r1)
                goto L146
            L126:
                int r1 = r0.zzb()
                r3.writeNoException()
                r3.writeInt(r1)
                goto L146
            L131:
                android.os.Bundle r1 = r0.zzd()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzd(r3, r1)
                goto L146
            L13c:
                com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzg()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zze(r3, r1)
            L146:
                r1 = 1
                return r1
        }
    }

    boolean zzA() throws android.os.RemoteException;

    int zzb() throws android.os.RemoteException;

    int zzc() throws android.os.RemoteException;

    @androidx.annotation.Nullable
    android.os.Bundle zzd() throws android.os.RemoteException;

    @androidx.annotation.Nullable
    com.google.android.gms.dynamic.IFragmentWrapper zze() throws android.os.RemoteException;

    @androidx.annotation.Nullable
    com.google.android.gms.dynamic.IFragmentWrapper zzf() throws android.os.RemoteException;

    @androidx.annotation.NonNull
    com.google.android.gms.dynamic.IObjectWrapper zzg() throws android.os.RemoteException;

    @androidx.annotation.NonNull
    com.google.android.gms.dynamic.IObjectWrapper zzh() throws android.os.RemoteException;

    @androidx.annotation.NonNull
    com.google.android.gms.dynamic.IObjectWrapper zzi() throws android.os.RemoteException;

    @androidx.annotation.Nullable
    java.lang.String zzj() throws android.os.RemoteException;

    void zzk(@androidx.annotation.NonNull com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException;

    void zzl(boolean r1) throws android.os.RemoteException;

    void zzm(boolean r1) throws android.os.RemoteException;

    void zzn(boolean r1) throws android.os.RemoteException;

    void zzo(boolean r1) throws android.os.RemoteException;

    void zzp(@androidx.annotation.NonNull android.content.Intent r1) throws android.os.RemoteException;

    void zzq(@androidx.annotation.NonNull android.content.Intent r1, int r2) throws android.os.RemoteException;

    void zzr(@androidx.annotation.NonNull com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException;

    boolean zzs() throws android.os.RemoteException;

    boolean zzt() throws android.os.RemoteException;

    boolean zzu() throws android.os.RemoteException;

    boolean zzv() throws android.os.RemoteException;

    boolean zzw() throws android.os.RemoteException;

    boolean zzx() throws android.os.RemoteException;

    boolean zzy() throws android.os.RemoteException;

    boolean zzz() throws android.os.RemoteException;
}
