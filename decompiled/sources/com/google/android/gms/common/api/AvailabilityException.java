package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class AvailabilityException extends java.lang.Exception {
    private final androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> zaa;

    public AvailabilityException(@androidx.annotation.NonNull androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.common.ConnectionResult getConnectionResult(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi<? extends com.google.android.gms.common.api.Api.ApiOptions> r5) {
            r4 = this;
            com.google.android.gms.common.api.internal.ApiKey r5 = r5.getApiKey()
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r0 = r4.zaa
            java.lang.Object r0 = r0.get(r5)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = r5.zab()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 58
            r3.<init>(r2)
            java.lang.String r2 = "The given API ("
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ") was not part of the availability request."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r0 = r4.zaa
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            return r5
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.common.ConnectionResult getConnectionResult(@androidx.annotation.NonNull com.google.android.gms.common.api.HasApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> r5) {
            r4 = this;
            com.google.android.gms.common.api.internal.ApiKey r5 = r5.getApiKey()
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r0 = r4.zaa
            java.lang.Object r0 = r0.get(r5)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = r5.zab()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 58
            r3.<init>(r2)
            java.lang.String r2 = "The given API ("
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ") was not part of the availability request."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r0 = r4.zaa
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            return r5
    }

    @Override // java.lang.Throwable
    @androidx.annotation.NonNull
    public java.lang.String getMessage() {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r1 = r9.zaa
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = 1
        L11:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r1.next()
            com.google.android.gms.common.api.internal.ApiKey r4 = (com.google.android.gms.common.api.internal.ApiKey) r4
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r5 = r9.zaa
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            boolean r6 = r5.isSuccess()
            r6 = r6 ^ r2
            r3 = r3 & r6
            java.lang.String r4 = r4.zab()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            int r7 = r5.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 2
            int r6 = r6 + r7
            r8.<init>(r6)
            r8.append(r4)
            java.lang.String r4 = ": "
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = r8.toString()
            r0.add(r4)
            goto L11
        L60:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r3 == 0) goto L6d
            java.lang.String r2 = "None of the queried APIs are available. "
            r1.append(r2)
            goto L72
        L6d:
            java.lang.String r2 = "Some of the queried APIs are unavailable. "
            r1.append(r2)
        L72:
            java.lang.String r2 = "; "
            java.lang.String r0 = android.text.TextUtils.join(r2, r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
