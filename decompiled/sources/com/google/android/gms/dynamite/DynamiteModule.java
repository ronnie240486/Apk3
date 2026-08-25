package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class DynamiteModule {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_LOCAL = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = null;

    @androidx.annotation.NonNull
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zza = null;

    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("DynamiteModule.class")
    private static java.lang.Boolean zzb = null;

    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("DynamiteModule.class")
    private static java.lang.String zzc = null;

    @javax.annotation.concurrent.GuardedBy("DynamiteModule.class")
    private static boolean zzd = false;

    @javax.annotation.concurrent.GuardedBy("DynamiteModule.class")
    private static int zze = -1;
    private static final java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> zzf = null;
    private static final java.lang.ThreadLocal<java.lang.Long> zzg = null;
    private static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions zzh = null;

    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("DynamiteModule.class")
    private static com.google.android.gms.dynamite.zzq zzj;

    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("DynamiteModule.class")
    private static com.google.android.gms.dynamite.zzr zzk;
    private final android.content.Context zzi;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @com.google.android.gms.common.util.DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @androidx.annotation.Nullable
        @javax.annotation.concurrent.GuardedBy("DynamiteLoaderClassLoader.class")
        public static java.lang.ClassLoader sClassLoader;

        public DynamiteLoaderClassLoader() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes2.dex */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class LoadingException extends java.lang.Exception {
        public /* synthetic */ LoadingException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public /* synthetic */ LoadingException(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes2.dex */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        /* JADX INFO: loaded from: classes3.dex */
        public interface IVersions {
            int zza(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2);

            int zzb(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, boolean r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        public static class SelectionResult {

            @com.google.android.gms.common.annotation.KeepForSdk
            public int localVersion;

            @com.google.android.gms.common.annotation.KeepForSdk
            public int remoteVersion;

            @com.google.android.gms.common.annotation.KeepForSdk
            public int selection;

            public SelectionResult() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.localVersion = r0
                    r1.remoteVersion = r0
                    r1.selection = r0
                    return
            }
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzf = r0
            com.google.android.gms.dynamite.zzd r0 = new com.google.android.gms.dynamite.zzd
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzg = r0
            com.google.android.gms.dynamite.zze r0 = new com.google.android.gms.dynamite.zze
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzh = r0
            com.google.android.gms.dynamite.zzf r0 = new com.google.android.gms.dynamite.zzf
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE = r0
            com.google.android.gms.dynamite.zzg r0 = new com.google.android.gms.dynamite.zzg
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_LOCAL = r0
            com.google.android.gms.dynamite.zzh r0 = new com.google.android.gms.dynamite.zzh
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE_VERSION_NO_FORCE_STAGING = r0
            com.google.android.gms.dynamite.zzi r0 = new com.google.android.gms.dynamite.zzi
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION = r0
            com.google.android.gms.dynamite.zzj r0 = new com.google.android.gms.dynamite.zzj
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = r0
            com.google.android.gms.dynamite.zzk r0 = new com.google.android.gms.dynamite.zzk
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION = r0
            com.google.android.gms.dynamite.zzl r0 = new com.google.android.gms.dynamite.zzl
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zza = r0
            return
    }

    private DynamiteModule(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zzi = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int getLocalVersion(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.lang.String r6) {
            java.lang.String r0 = "DynamiteModule"
            r1 = 0
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            int r2 = r2.length()     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            int r2 = r2 + 61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            r3.<init>(r2)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r2 = "com.google.android.gms.dynamite.descriptors."
            r3.append(r2)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            r3.append(r6)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r2 = "."
            r3.append(r2)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r2 = "ModuleDescriptor"
            r3.append(r2)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.Class r5 = r5.loadClass(r2)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r2 = "MODULE_ID"
            java.lang.reflect.Field r2 = r5.getDeclaredField(r2)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r3 = "MODULE_VERSION"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r3)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r6)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            if (r4 != 0) goto L84
            java.lang.Object r5 = r2.get(r3)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            int r2 = r5.length()     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            int r2 = r2 + 51
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            int r3 = r3.length()     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            r3.<init>(r2)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r2 = "Module descriptor id '"
            r3.append(r2)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            r3.append(r5)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r5 = "' didn't match expected id '"
            r3.append(r5)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            r3.append(r6)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r5 = "'"
            r3.append(r5)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            android.util.Log.e(r0, r5)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            return r1
        L84:
            int r5 = r5.getInt(r3)     // Catch: java.lang.Exception -> L89 java.lang.ClassNotFoundException -> La8
            return r5
        L89:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Failed to load module descriptor class: "
            int r2 = r5.length()
            if (r2 == 0) goto L9f
            java.lang.String r5 = r6.concat(r5)
            goto La4
        L9f:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        La4:
            android.util.Log.e(r0, r5)
            goto Lcb
        La8:
            java.lang.String r5 = java.lang.String.valueOf(r6)
            int r5 = r5.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r5 = r5 + 45
            r2.<init>(r5)
            java.lang.String r5 = "Local module descriptor class for "
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = " not found."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.w(r0, r5)
        Lcb:
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int getRemoteVersion(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = 0
            int r1 = zza(r1, r2, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.dynamite.DynamiteModule load(@androidx.annotation.NonNull android.content.Context r19, @androidx.annotation.NonNull com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r20, @androidx.annotation.NonNull java.lang.String r21) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r0 = com.google.android.gms.dynamite.DynamiteModule.zzf
            java.lang.Object r5 = r0.get()
            com.google.android.gms.dynamite.zzn r5 = (com.google.android.gms.dynamite.zzn) r5
            com.google.android.gms.dynamite.zzn r6 = new com.google.android.gms.dynamite.zzn
            r7 = 0
            r6.<init>(r7)
            r0.set(r6)
            java.lang.ThreadLocal<java.lang.Long> r8 = com.google.android.gms.dynamite.DynamiteModule.zzg
            java.lang.Object r9 = r8.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2f9
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L2f9
            r8.set(r13)     // Catch: java.lang.Throwable -> L2f9
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions r13 = com.google.android.gms.dynamite.DynamiteModule.zzh     // Catch: java.lang.Throwable -> L2f9
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r13 = r2.selectModule(r1, r3, r13)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r14 = "DynamiteModule"
            int r15 = r13.localVersion     // Catch: java.lang.Throwable -> L2f9
            int r7 = r13.remoteVersion     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r17 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> L2f9
            int r17 = r17.length()     // Catch: java.lang.Throwable -> L2f9
            int r17 = r17 + 68
            java.lang.String r18 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> L2f9
            int r18 = r18.length()     // Catch: java.lang.Throwable -> L2f9
            int r11 = r17 + r18
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f9
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r11 = "Considering local module "
            r12.append(r11)     // Catch: java.lang.Throwable -> L2f9
            r12.append(r3)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r11 = ":"
            r12.append(r11)     // Catch: java.lang.Throwable -> L2f9
            r12.append(r15)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r11 = " and remote module "
            r12.append(r11)     // Catch: java.lang.Throwable -> L2f9
            r12.append(r3)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r11 = ":"
            r12.append(r11)     // Catch: java.lang.Throwable -> L2f9
            r12.append(r7)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r7 = r12.toString()     // Catch: java.lang.Throwable -> L2f9
            android.util.Log.i(r14, r7)     // Catch: java.lang.Throwable -> L2f9
            int r7 = r13.selection     // Catch: java.lang.Throwable -> L2f9
            if (r7 == 0) goto L2bf
            r11 = -1
            if (r7 != r11) goto L88
            int r7 = r13.localVersion     // Catch: java.lang.Throwable -> L2f9
            if (r7 == 0) goto L2bf
            r7 = -1
        L88:
            r12 = 1
            if (r7 != r12) goto L8f
            int r14 = r13.remoteVersion     // Catch: java.lang.Throwable -> L2f9
            if (r14 == 0) goto L2bf
        L8f:
            if (r7 != r11) goto Lb1
            com.google.android.gms.dynamite.DynamiteModule r1 = zzc(r1, r3)     // Catch: java.lang.Throwable -> L2f9
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto L9f
            r8.remove()
            goto La6
        L9f:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r8.set(r2)
        La6:
            android.database.Cursor r2 = r6.zza
            if (r2 == 0) goto Lad
            r2.close()
        Lad:
            r0.set(r5)
            return r1
        Lb1:
            if (r7 != r12) goto L2a6
            int r14 = r13.remoteVersion     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L242 java.lang.Throwable -> L2f9
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.Boolean r15 = com.google.android.gms.dynamite.DynamiteModule.zzb     // Catch: java.lang.Throwable -> L228
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L228
            if (r15 == 0) goto L220
            boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            r12 = 2
            if (r15 == 0) goto L16e
            java.lang.String r15 = "DynamiteModule"
            java.lang.String r18 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            int r18 = r18.length()     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            int r11 = r18 + 51
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r11 = "Selected remote version of "
            r7.append(r11)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            r7.append(r3)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r11 = ", version >= "
            r7.append(r11)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            r7.append(r14)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            android.util.Log.i(r15, r7)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamite.zzr r7 = com.google.android.gms.dynamite.DynamiteModule.zzk     // Catch: java.lang.Throwable -> L16b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L16b
            if (r7 == 0) goto L163
            java.lang.Object r11 = r0.get()     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamite.zzn r11 = (com.google.android.gms.dynamite.zzn) r11     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            if (r11 == 0) goto L15b
            android.database.Cursor r15 = r11.zza     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            if (r15 == 0) goto L15b
            android.content.Context r15 = r19.getApplicationContext()     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            android.database.Cursor r11 = r11.zza     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            r16 = 0
            com.google.android.gms.dynamic.ObjectWrapper.wrap(r16)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            int r2 = com.google.android.gms.dynamite.DynamiteModule.zze     // Catch: java.lang.Throwable -> L158
            if (r2 < r12) goto L10e
            r12 = 1
            goto L10f
        L10e:
            r12 = 0
        L10f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L158
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L158
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            if (r2 == 0) goto L12e
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r4 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r2, r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r15)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r2 = r7.zzf(r2, r3, r14, r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            goto L141
        L12e:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r4 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r2, r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r15)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r2 = r7.zze(r2, r3, r14, r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L141:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            if (r2 == 0) goto L150
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            goto L1f4
        L150:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r2 = "Failed to get module context"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            throw r0     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L158:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L158
            throw r0     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L15b:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r2 = "No result cursor"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            throw r0     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L163:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r2 = "DynamiteLoaderV2 was not cached."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            throw r0     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L16b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L16b
            throw r0     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L16e:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r4 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            int r4 = r4 + 51
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r4 = "Selected remote version of "
            r7.append(r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            r7.append(r3)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r4 = ", version >= "
            r7.append(r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            r7.append(r14)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            android.util.Log.i(r2, r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamite.zzq r2 = zzf(r19)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            if (r2 == 0) goto L218
            int r4 = r2.zze()     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            r7 = 3
            if (r4 < r7) goto L1c2
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamite.zzn r4 = (com.google.android.gms.dynamite.zzn) r4     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            if (r4 == 0) goto L1ba
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r19)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            android.database.Cursor r4 = r4.zza     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzi(r7, r3, r14, r4)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            goto L1e3
        L1ba:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r2 = "No cached result cursor holder"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            throw r0     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L1c2:
            if (r4 != r12) goto L1d4
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r7 = "IDynamite loader version = 2"
            android.util.Log.w(r4, r7)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r19)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzj(r4, r3, r14)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            goto L1e3
        L1d4:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r7 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r4, r7)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r19)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzh(r4, r3, r14)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L1e3:
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            if (r4 == 0) goto L210
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L1f4:
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L1fe
            r8.remove()
            goto L205
        L1fe:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r8.set(r1)
        L205:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L20c
            r1.close()
        L20c:
            r0.set(r5)
            return r4
        L210:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r2 = "Failed to load remote module."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            throw r0     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L218:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r2 = "Failed to create IDynamiteLoader."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            throw r0     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L220:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            java.lang.String r2 = "Failed to determine which loading route to use."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
            throw r0     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L228:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L228
            throw r0     // Catch: java.lang.Throwable -> L22b com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L237 android.os.RemoteException -> L239
        L22b:
            r0 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r0)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L242 java.lang.Throwable -> L2f9
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r2 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L242 java.lang.Throwable -> L2f9
            java.lang.String r4 = "Failed to load remote module."
            r2.<init>(r4, r0)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L242 java.lang.Throwable -> L2f9
            throw r2     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L242 java.lang.Throwable -> L2f9
        L237:
            r0 = move-exception
            throw r0     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L242 java.lang.Throwable -> L2f9
        L239:
            r0 = move-exception
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r2 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L242 java.lang.Throwable -> L2f9
            java.lang.String r4 = "Failed to load remote module."
            r2.<init>(r4, r0)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L242 java.lang.Throwable -> L2f9
            throw r2     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L242 java.lang.Throwable -> L2f9
        L242:
            r0 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r4 = "Failed to load remote module: "
            java.lang.String r7 = r0.getMessage()     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L2f9
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L2f9
            if (r8 == 0) goto L25a
            java.lang.String r4 = r4.concat(r7)     // Catch: java.lang.Throwable -> L2f9
            goto L260
        L25a:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L2f9
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L2f9
            r4 = r7
        L260:
            android.util.Log.w(r2, r4)     // Catch: java.lang.Throwable -> L2f9
            int r2 = r13.localVersion     // Catch: java.lang.Throwable -> L2f9
            if (r2 == 0) goto L29e
            com.google.android.gms.dynamite.zzo r4 = new com.google.android.gms.dynamite.zzo     // Catch: java.lang.Throwable -> L2f9
            r7 = 0
            r4.<init>(r2, r7)     // Catch: java.lang.Throwable -> L2f9
            r2 = r20
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r2 = r2.selectModule(r1, r3, r4)     // Catch: java.lang.Throwable -> L2f9
            int r2 = r2.selection     // Catch: java.lang.Throwable -> L2f9
            r4 = -1
            if (r2 != r4) goto L29e
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r1, r3)     // Catch: java.lang.Throwable -> L2f9
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L288
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.zzg
            r1.remove()
            goto L291
        L288:
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.zzg
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L291:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L298
            r1.close()
        L298:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r1 = com.google.android.gms.dynamite.DynamiteModule.zzf
            r1.set(r5)
            return r0
        L29e:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L2f9
            throw r1     // Catch: java.lang.Throwable -> L2f9
        L2a6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L2f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f9
            r2 = 47
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f9
            r1.append(r7)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2f9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f9
            throw r0     // Catch: java.lang.Throwable -> L2f9
        L2bf:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L2f9
            int r1 = r13.localVersion     // Catch: java.lang.Throwable -> L2f9
            int r2 = r13.remoteVersion     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r4 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> L2f9
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L2f9
            int r4 = r4 + 92
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f9
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r4 = "No acceptable module "
            r7.append(r4)     // Catch: java.lang.Throwable -> L2f9
            r7.append(r3)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r3 = " found. Local version is "
            r7.append(r3)     // Catch: java.lang.Throwable -> L2f9
            r7.append(r1)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r1 = " and remote version is "
            r7.append(r1)     // Catch: java.lang.Throwable -> L2f9
            r7.append(r2)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r1 = "."
            r7.append(r1)     // Catch: java.lang.Throwable -> L2f9
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L2f9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f9
            throw r0     // Catch: java.lang.Throwable -> L2f9
        L2f9:
            r0 = move-exception
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L306
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.zzg
            r1.remove()
            goto L30f
        L306:
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.zzg
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L30f:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L316
            r1.close()
        L316:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r1 = com.google.android.gms.dynamite.DynamiteModule.zzf
            r1.set(r5)
            throw r0
    }

    public static int zza(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull java.lang.String r10, boolean r11) {
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1c8
            java.lang.Boolean r1 = com.google.android.gms.dynamite.DynamiteModule.zzb     // Catch: java.lang.Throwable -> L1c5
            r2 = 0
            if (r1 != 0) goto Ld3
            android.content.Context r1 = r9.getApplicationContext()     // Catch: java.lang.NoSuchFieldException -> Laa java.lang.IllegalAccessException -> Lac java.lang.ClassNotFoundException -> Lae java.lang.Throwable -> L1c5
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.NoSuchFieldException -> Laa java.lang.IllegalAccessException -> Lac java.lang.ClassNotFoundException -> Lae java.lang.Throwable -> L1c5
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r3 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r3 = r3.getName()     // Catch: java.lang.NoSuchFieldException -> Laa java.lang.IllegalAccessException -> Lac java.lang.ClassNotFoundException -> Lae java.lang.Throwable -> L1c5
            java.lang.Class r1 = r1.loadClass(r3)     // Catch: java.lang.NoSuchFieldException -> Laa java.lang.IllegalAccessException -> Lac java.lang.ClassNotFoundException -> Lae java.lang.Throwable -> L1c5
            java.lang.String r3 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> Laa java.lang.IllegalAccessException -> Lac java.lang.ClassNotFoundException -> Lae java.lang.Throwable -> L1c5
            java.lang.Class r3 = r1.getDeclaringClass()     // Catch: java.lang.NoSuchFieldException -> Laa java.lang.IllegalAccessException -> Lac java.lang.ClassNotFoundException -> Lae java.lang.Throwable -> L1c5
            monitor-enter(r3)     // Catch: java.lang.NoSuchFieldException -> Laa java.lang.IllegalAccessException -> Lac java.lang.ClassNotFoundException -> Lae java.lang.Throwable -> L1c5
            java.lang.Object r4 = r1.get(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L3e
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> La7
            if (r4 != r1) goto L38
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> La7
            goto La5
        L38:
            zzd(r4)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3b java.lang.Throwable -> La7
        L3b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> La7
            goto La5
        L3e:
            boolean r4 = com.google.android.gms.dynamite.DynamiteModule.zzd     // Catch: java.lang.Throwable -> La7
            if (r4 != 0) goto L9c
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> La7
            boolean r5 = r4.equals(r2)     // Catch: java.lang.Throwable -> La7
            if (r5 == 0) goto L4b
            goto L9c
        L4b:
            int r5 = zzb(r9, r10, r11)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            java.lang.String r6 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            if (r6 == 0) goto L8f
            boolean r6 = r6.isEmpty()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            if (r6 == 0) goto L5a
            goto L8f
        L5a:
            java.lang.ClassLoader r6 = com.google.android.gms.dynamite.zzb.zza()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            if (r6 == 0) goto L61
            goto L84
        L61:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            r7 = 29
            if (r6 < r7) goto L76
            dalvik.system.DelegateLastClassLoader r6 = new dalvik.system.DelegateLastClassLoader     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            java.lang.String r7 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            r6.<init>(r7, r8)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            goto L84
        L76:
            com.google.android.gms.dynamite.zzc r6 = new com.google.android.gms.dynamite.zzc     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            java.lang.String r7 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            r6.<init>(r7, r8)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
        L84:
            zzd(r6)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            r1.set(r2, r6)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            com.google.android.gms.dynamite.DynamiteModule.zzb = r4     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L92 java.lang.Throwable -> La7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c5
            return r5
        L8f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c5
            return r5
        L92:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> La7
            r1.set(r2, r4)     // Catch: java.lang.Throwable -> La7
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> La7
            goto La5
        L9c:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> La7
            r1.set(r2, r4)     // Catch: java.lang.Throwable -> La7
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> La7
        La5:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La7
            goto Ld1
        La7:
            r1 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La7
            throw r1     // Catch: java.lang.NoSuchFieldException -> Laa java.lang.IllegalAccessException -> Lac java.lang.ClassNotFoundException -> Lae java.lang.Throwable -> L1c5
        Laa:
            r1 = move-exception
            goto Laf
        Lac:
            r1 = move-exception
            goto Laf
        Lae:
            r1 = move-exception
        Laf:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1c5
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L1c5
            int r4 = r4 + 30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c5
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1c5
            java.lang.String r4 = "Failed to load module via V2: "
            r5.append(r4)     // Catch: java.lang.Throwable -> L1c5
            r5.append(r1)     // Catch: java.lang.Throwable -> L1c5
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L1c5
            android.util.Log.w(r3, r1)     // Catch: java.lang.Throwable -> L1c5
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1c5
        Ld1:
            com.google.android.gms.dynamite.DynamiteModule.zzb = r1     // Catch: java.lang.Throwable -> L1c5
        Ld3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c5
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L1c8
            r1 = 0
            if (r0 == 0) goto L101
            int r9 = zzb(r9, r10, r11)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Le0 java.lang.Throwable -> L1c8
            return r9
        Le0:
            r10 = move-exception
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L1c8
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L1c8
            if (r2 == 0) goto Lf8
            java.lang.String r10 = r0.concat(r10)     // Catch: java.lang.Throwable -> L1c8
            goto Lfd
        Lf8:
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L1c8
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L1c8
        Lfd:
            android.util.Log.w(r11, r10)     // Catch: java.lang.Throwable -> L1c8
            return r1
        L101:
            com.google.android.gms.dynamite.zzq r3 = zzf(r9)     // Catch: java.lang.Throwable -> L1c8
            if (r3 != 0) goto L109
            goto L1bc
        L109:
            int r0 = r3.zze()     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            r4 = 3
            if (r0 < r4) goto L171
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r0 = com.google.android.gms.dynamite.DynamiteModule.zzf     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            java.lang.Object r0 = r0.get()     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            if (r0 == 0) goto L124
            android.database.Cursor r0 = r0.zza     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            if (r0 == 0) goto L124
            int r1 = r0.getInt(r1)     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            goto L1bc
        L124:
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            java.lang.ThreadLocal<java.lang.Long> r0 = com.google.android.gms.dynamite.DynamiteModule.zzg     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            java.lang.Object r0 = r0.get()     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            long r7 = r0.longValue()     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            r5 = r10
            r6 = r11
            com.google.android.gms.dynamic.IObjectWrapper r10 = r3.zzk(r4, r5, r6, r7)     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            if (r10 == 0) goto L15e
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L16b android.os.RemoteException -> L16e
            if (r11 != 0) goto L149
            goto L15e
        L149:
            int r11 = r10.getInt(r1)     // Catch: java.lang.Throwable -> L16b android.os.RemoteException -> L16e
            if (r11 <= 0) goto L156
            boolean r0 = zze(r10)     // Catch: java.lang.Throwable -> L16b android.os.RemoteException -> L16e
            if (r0 == 0) goto L156
            goto L157
        L156:
            r2 = r10
        L157:
            if (r2 == 0) goto L15c
            r2.close()     // Catch: java.lang.Throwable -> L1c8
        L15c:
            r1 = r11
            goto L1bc
        L15e:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> L16b android.os.RemoteException -> L16e
            if (r10 == 0) goto L1bc
            r10.close()     // Catch: java.lang.Throwable -> L1c8
            goto L1bc
        L16b:
            r11 = move-exception
            r2 = r10
            goto L1bf
        L16e:
            r11 = move-exception
            r2 = r10
            goto L198
        L171:
            r4 = 2
            if (r0 != r4) goto L184
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r4)     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            int r1 = r3.zzg(r0, r10, r11)     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            goto L1bc
        L184:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r4)     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            int r1 = r3.zzf(r0, r10, r11)     // Catch: android.os.RemoteException -> L196 java.lang.Throwable -> L1bd
            goto L1bc
        L194:
            r11 = r10
            goto L1bf
        L196:
            r10 = move-exception
            r11 = r10
        L198:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L1bd
            int r3 = r11.length()     // Catch: java.lang.Throwable -> L1bd
            if (r3 == 0) goto L1af
            java.lang.String r11 = r0.concat(r11)     // Catch: java.lang.Throwable -> L1bd
            goto L1b4
        L1af:
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L1bd
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L1bd
        L1b4:
            android.util.Log.w(r10, r11)     // Catch: java.lang.Throwable -> L1bd
            if (r2 == 0) goto L1bc
            r2.close()     // Catch: java.lang.Throwable -> L1c8
        L1bc:
            return r1
        L1bd:
            r10 = move-exception
            goto L194
        L1bf:
            if (r2 == 0) goto L1c4
            r2.close()     // Catch: java.lang.Throwable -> L1c8
        L1c4:
            throw r11     // Catch: java.lang.Throwable -> L1c8
        L1c5:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c5
            throw r10     // Catch: java.lang.Throwable -> L1c8
        L1c8:
            r10 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r9, r10)
            throw r10
    }

    private static int zzb(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.zzg     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            r12.<init>()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lb8
            if (r10 == 0) goto La1
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            if (r11 == 0) goto La1
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            if (r12 <= 0) goto L8e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.zzc = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L70
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.zze = r2     // Catch: java.lang.Throwable -> L8b
        L70:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L83
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L7f
            goto L80
        L7f:
            r9 = 0
        L80:
            com.google.android.gms.dynamite.DynamiteModule.zzd = r9     // Catch: java.lang.Throwable -> L8b
            r11 = r9
        L83:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = zze(r10)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            if (r1 == 0) goto L8e
            goto L8f
        L8b:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r11     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
        L8e:
            r0 = r10
        L8f:
            if (r11 != 0) goto L97
            if (r0 == 0) goto L96
            r0.close()
        L96:
            return r12
        L97:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lc8
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lc8
            throw r10     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lc8
        L9f:
            r11 = move-exception
            goto Lba
        La1:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            throw r11     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
        Lb0:
            r11 = move-exception
            r0 = r10
            goto Lc9
        Lb3:
            r11 = move-exception
            r0 = r10
            goto Lba
        Lb6:
            r10 = move-exception
            goto Lca
        Lb8:
            r10 = move-exception
            r11 = r10
        Lba:
            boolean r10 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> Lc8
            if (r10 == 0) goto Lc0
            throw r11     // Catch: java.lang.Throwable -> Lc8
        Lc0:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r12 = "V2 version check failed"
            r10.<init>(r12, r11)     // Catch: java.lang.Throwable -> Lc8
            throw r10     // Catch: java.lang.Throwable -> Lc8
        Lc8:
            r11 = move-exception
        Lc9:
            r10 = r11
        Lca:
            if (r0 == 0) goto Lcf
            r0.close()
        Lcf:
            throw r10
    }

    private static com.google.android.gms.dynamite.DynamiteModule zzc(android.content.Context r2, java.lang.String r3) {
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "Selected local version of "
            if (r0 == 0) goto L11
            java.lang.String r3 = r1.concat(r3)
            goto L16
        L11:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L16:
            java.lang.String r0 = "DynamiteModule"
            android.util.Log.i(r0, r3)
            com.google.android.gms.dynamite.DynamiteModule r3 = new com.google.android.gms.dynamite.DynamiteModule
            android.content.Context r2 = r2.getApplicationContext()
            r3.<init>(r2)
            return r3
    }

    @javax.annotation.concurrent.GuardedBy("DynamiteModule.class")
    private static void zzd(java.lang.ClassLoader r2) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            java.lang.String r0 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r2 = r2.loadClass(r0)     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Object r2 = r2.newInstance(r0)     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            if (r2 != 0) goto L19
            r2 = 0
            goto L2d
        L19:
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            boolean r1 = r0 instanceof com.google.android.gms.dynamite.zzr     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            if (r1 == 0) goto L27
            r2 = r0
            com.google.android.gms.dynamite.zzr r2 = (com.google.android.gms.dynamite.zzr) r2     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            goto L2d
        L27:
            com.google.android.gms.dynamite.zzr r0 = new com.google.android.gms.dynamite.zzr     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            r0.<init>(r2)     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            r2 = r0
        L2d:
            com.google.android.gms.dynamite.DynamiteModule.zzk = r2     // Catch: java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L32 java.lang.InstantiationException -> L34 java.lang.IllegalAccessException -> L36 java.lang.ClassNotFoundException -> L38
            return
        L30:
            r2 = move-exception
            goto L39
        L32:
            r2 = move-exception
            goto L39
        L34:
            r2 = move-exception
            goto L39
        L36:
            r2 = move-exception
            goto L39
        L38:
            r2 = move-exception
        L39:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            r0.<init>(r1, r2)
            throw r0
    }

    private static boolean zze(android.database.Cursor r2) {
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r0 = com.google.android.gms.dynamite.DynamiteModule.zzf
            java.lang.Object r0 = r0.get()
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0
            if (r0 == 0) goto L12
            android.database.Cursor r1 = r0.zza
            if (r1 != 0) goto L12
            r0.zza = r2
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    private static com.google.android.gms.dynamite.zzq zzf(android.content.Context r5) {
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.zzq r1 = com.google.android.gms.dynamite.DynamiteModule.zzj     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return r1
        L9:
            r1 = 0
            java.lang.String r2 = "com.google.android.gms"
            r3 = 3
            android.content.Context r5 = r5.createPackageContext(r2, r3)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            java.lang.String r2 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r5 = r5.loadClass(r2)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            if (r5 != 0) goto L25
            r2 = r1
            goto L37
        L25:
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r5.queryLocalInterface(r2)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            boolean r3 = r2 instanceof com.google.android.gms.dynamite.zzq     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            if (r3 == 0) goto L32
            com.google.android.gms.dynamite.zzq r2 = (com.google.android.gms.dynamite.zzq) r2     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            goto L37
        L32:
            com.google.android.gms.dynamite.zzq r2 = new com.google.android.gms.dynamite.zzq     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            r2.<init>(r5)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
        L37:
            if (r2 == 0) goto L5d
            com.google.android.gms.dynamite.DynamiteModule.zzj = r2     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return r2
        L3d:
            r5 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r3 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L5f
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L55
            java.lang.String r5 = r3.concat(r5)     // Catch: java.lang.Throwable -> L5f
            goto L5a
        L55:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L5f
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L5f
        L5a:
            android.util.Log.e(r2, r5)     // Catch: java.lang.Throwable -> L5f
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return r1
        L5f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r5
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Context getModuleContext() {
            r1 = this;
            android.content.Context r0 = r1.zzi
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.IBinder instantiate(@androidx.annotation.NonNull java.lang.String r5) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r4 = this;
            android.content.Context r0 = r4.zzi     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Class r0 = r0.loadClass(r5)     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            return r0
        L11:
            r0 = move-exception
            goto L16
        L13:
            r0 = move-exception
            goto L16
        L15:
            r0 = move-exception
        L16:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Failed to instantiate module class: "
            int r3 = r5.length()
            if (r3 == 0) goto L29
            java.lang.String r5 = r2.concat(r5)
            goto L2e
        L29:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L2e:
            r1.<init>(r5, r0)
            throw r1
    }
}
