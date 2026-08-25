package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zaz extends com.google.android.gms.dynamic.RemoteCreator<com.google.android.gms.common.internal.zam> {
    private static final com.google.android.gms.common.internal.zaz zaa = null;

    static {
            com.google.android.gms.common.internal.zaz r0 = new com.google.android.gms.common.internal.zaz
            r0.<init>()
            com.google.android.gms.common.internal.zaz.zaa = r0
            return
    }

    private zaz() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.view.View zaa(android.content.Context r4, int r5, int r6) throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException {
            com.google.android.gms.common.internal.zaz r0 = com.google.android.gms.common.internal.zaz.zaa
            com.google.android.gms.common.internal.zax r1 = new com.google.android.gms.common.internal.zax     // Catch: java.lang.Exception -> L1e
            r2 = 1
            r3 = 0
            r1.<init>(r2, r5, r6, r3)     // Catch: java.lang.Exception -> L1e
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: java.lang.Exception -> L1e
            java.lang.Object r4 = r0.getRemoteCreatorInstance(r4)     // Catch: java.lang.Exception -> L1e
            com.google.android.gms.common.internal.zam r4 = (com.google.android.gms.common.internal.zam) r4     // Catch: java.lang.Exception -> L1e
            com.google.android.gms.dynamic.IObjectWrapper r4 = r4.zae(r2, r1)     // Catch: java.lang.Exception -> L1e
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)     // Catch: java.lang.Exception -> L1e
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Exception -> L1e
            return r4
        L1e:
            r4 = move-exception
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 64
            r1.<init>(r2)
            java.lang.String r2 = "Could not get button with size "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " and color "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r4)
            throw r0
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ com.google.android.gms.common.internal.zam getRemoteCreator(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.common.internal.ISignInButtonCreator"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.zam
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.common.internal.zam r3 = (com.google.android.gms.common.internal.zam) r3
            goto L18
        L12:
            com.google.android.gms.common.internal.zam r0 = new com.google.android.gms.common.internal.zam
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }
}
