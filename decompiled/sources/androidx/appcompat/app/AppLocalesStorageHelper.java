package androidx.appcompat.app;

/* JADX INFO: loaded from: classes3.dex */
class AppLocalesStorageHelper {

    public static class SerialExecutor implements java.util.concurrent.Executor {
        public java.lang.Runnable mActive;
        public final java.util.concurrent.Executor mExecutor;
        private final java.lang.Object mLock;
        public final java.util.Queue<java.lang.Runnable> mTasks;

        public static /* synthetic */ void $r8$lambda$VQIUCyuFJVaYXOOy5lMhu8dTj68(androidx.appcompat.app.AppLocalesStorageHelper.SerialExecutor r0, java.lang.Runnable r1) {
                r0.lambda$execute$0(r1)
                return
        }

        public SerialExecutor(java.util.concurrent.Executor r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r1.mTasks = r0
                r1.mExecutor = r2
                return
        }

        private /* synthetic */ void lambda$execute$0(java.lang.Runnable r1) {
                r0 = this;
                r1.run()     // Catch: java.lang.Throwable -> L7
                r0.scheduleNext()
                return
            L7:
                r1 = move-exception
                r0.scheduleNext()
                throw r1
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r4) {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                java.util.Queue<java.lang.Runnable> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L16
                androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor$$ExternalSyntheticLambda0 r2 = new androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L16
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16
                r1.add(r2)     // Catch: java.lang.Throwable -> L16
                java.lang.Runnable r4 = r3.mActive     // Catch: java.lang.Throwable -> L16
                if (r4 != 0) goto L14
                r3.scheduleNext()     // Catch: java.lang.Throwable -> L16
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return
            L16:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r4
        }

        public final void scheduleNext() {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                java.util.Queue<java.lang.Runnable> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L16
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L16
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L16
                r3.mActive = r1     // Catch: java.lang.Throwable -> L16
                if (r1 == 0) goto L14
                java.util.concurrent.Executor r2 = r3.mExecutor     // Catch: java.lang.Throwable -> L16
                r2.execute(r1)     // Catch: java.lang.Throwable -> L16
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return
            L16:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ThreadPerTaskExecutor implements java.util.concurrent.Executor {
        public ThreadPerTaskExecutor() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r2)
                r0.start()
                return
        }
    }

    private AppLocalesStorageHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void persistLocales(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull java.lang.String r7) {
            java.lang.String r0 = "locales"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            boolean r2 = r7.equals(r2)
            java.lang.String r3 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            if (r2 == 0) goto L12
            r6.deleteFile(r3)
            return
        L12:
            r2 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r3, r2)     // Catch: java.io.FileNotFoundException -> L74
            org.xmlpull.v1.XmlSerializer r2 = android.util.Xml.newSerializer()
            r3 = 0
            r2.setOutput(r6, r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r4 = "UTF-8"
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r2.startDocument(r4, r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r2.startTag(r3, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r4 = "application_locales"
            r2.attribute(r3, r4, r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r2.endTag(r3, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r2.endDocument()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r2 = "Storing App Locales : app-locales: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.append(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r2 = " persisted successfully."
            r0.append(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r6 == 0) goto L6d
        L4f:
            r6.close()     // Catch: java.io.IOException -> L6d
            goto L6d
        L53:
            r7 = move-exception
            goto L6e
        L55:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r2.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = "Storing App Locales : Failed to persist app-locales: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L53
            r2.append(r7)     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L53
            android.util.Log.w(r1, r7, r0)     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L6d
            goto L4f
        L6d:
            return
        L6e:
            if (r6 == 0) goto L73
            r6.close()     // Catch: java.io.IOException -> L73
        L73:
            throw r7
        L74:
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r3
            java.lang.String r7 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.w(r1, r6)
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String readLocales(@androidx.annotation.NonNull android.content.Context r9) {
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L77
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            r7 = 1
            if (r6 == r7) goto L40
            r7 = 3
            if (r6 != r7) goto L27
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            if (r8 <= r5) goto L40
        L27:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L2d
            goto L17
        L2d:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            if (r6 == 0) goto L17
            r5 = 0
            java.lang.String r6 = "application_locales"
            java.lang.String r2 = r4.getAttributeValue(r5, r6)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
        L40:
            if (r3 == 0) goto L52
        L42:
            r3.close()     // Catch: java.io.IOException -> L46
            goto L52
        L46:
            goto L52
        L48:
            r9 = move-exception
            goto L71
        L4a:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L52
            goto L42
        L52:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r1, r9)
            goto L70
        L6d:
            r9.deleteFile(r0)
        L70:
            return r2
        L71:
            if (r3 == 0) goto L76
            r3.close()     // Catch: java.io.IOException -> L76
        L76:
            throw r9
        L77:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
    }
}
