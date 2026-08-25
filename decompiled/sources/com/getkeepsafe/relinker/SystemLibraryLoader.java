package com.getkeepsafe.relinker;

/* JADX INFO: loaded from: classes2.dex */
final class SystemLibraryLoader implements com.getkeepsafe.relinker.ReLinker.LibraryLoader {
    public SystemLibraryLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryLoader
    public void loadLibrary(java.lang.String r1) {
            r0 = this;
            java.lang.System.loadLibrary(r1)
            return
    }

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryLoader
    public void loadPath(java.lang.String r1) {
            r0 = this;
            java.lang.System.load(r1)
            return
    }

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryLoader
    public java.lang.String mapLibraryName(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "lib"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L11
            java.lang.String r0 = ".so"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L11
            return r2
        L11:
            java.lang.String r2 = java.lang.System.mapLibraryName(r2)
            return r2
    }

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryLoader
    public java.lang.String[] supportedAbis() {
            r5 = this;
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            int r1 = r0.length
            if (r1 <= 0) goto L6
            return r0
        L6:
            java.lang.String r0 = android.os.Build.CPU_ABI2
            boolean r1 = com.getkeepsafe.relinker.TextUtils.isEmpty(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1a
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r4 = android.os.Build.CPU_ABI
            r1[r2] = r4
            r1[r3] = r0
            return r1
        L1a:
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r1 = android.os.Build.CPU_ABI
            r0[r2] = r1
            return r0
    }

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryLoader
    public java.lang.String unmapLibraryName(java.lang.String r3) {
            r2 = this;
            int r0 = r3.length()
            r1 = 3
            int r0 = r0 - r1
            java.lang.String r3 = r3.substring(r1, r0)
            return r3
    }
}
