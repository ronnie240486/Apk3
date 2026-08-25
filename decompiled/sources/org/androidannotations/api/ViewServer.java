package org.androidannotations.api;

/* JADX INFO: loaded from: classes.dex */
public class ViewServer implements java.lang.Runnable {
    private static final java.lang.String BUILD_TYPE_USER = "user";
    private static final java.lang.String COMMAND_PROTOCOL_VERSION = "PROTOCOL";
    private static final java.lang.String COMMAND_SERVER_VERSION = "SERVER";
    private static final java.lang.String COMMAND_WINDOW_MANAGER_AUTOLIST = "AUTOLIST";
    private static final java.lang.String COMMAND_WINDOW_MANAGER_GET_FOCUS = "GET_FOCUS";
    private static final java.lang.String COMMAND_WINDOW_MANAGER_LIST = "LIST";
    private static final java.lang.String LOG_TAG = "ViewServer";
    private static final java.lang.String VALUE_PROTOCOL_VERSION = "4";
    private static final java.lang.String VALUE_SERVER_VERSION = "4";
    private static final int VIEW_SERVER_DEFAULT_PORT = 4939;
    private static final int VIEW_SERVER_MAX_CONNECTIONS = 10;
    private static org.androidannotations.api.ViewServer sServer;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mFocusLock;
    private android.view.View mFocusedWindow;
    private final java.util.List<org.androidannotations.api.ViewServer.WindowListener> mListeners;
    private final int mPort;
    private java.net.ServerSocket mServer;
    private java.lang.Thread mThread;
    private java.util.concurrent.ExecutorService mThreadPool;
    private final java.util.HashMap<android.view.View, java.lang.String> mWindows;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mWindowsLock;

    /* JADX INFO: renamed from: org.androidannotations.api.ViewServer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class NoopViewServer extends org.androidannotations.api.ViewServer {
        private NoopViewServer() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public /* synthetic */ NoopViewServer(org.androidannotations.api.ViewServer.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.androidannotations.api.ViewServer
        public void addWindow(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // org.androidannotations.api.ViewServer
        public void addWindow(android.view.View r1, java.lang.String r2) {
                r0 = this;
                return
        }

        @Override // org.androidannotations.api.ViewServer
        public boolean isRunning() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.androidannotations.api.ViewServer
        public void removeWindow(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // org.androidannotations.api.ViewServer
        public void removeWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // org.androidannotations.api.ViewServer, java.lang.Runnable
        public void run() {
                r0 = this;
                return
        }

        @Override // org.androidannotations.api.ViewServer
        public void setFocusedWindow(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // org.androidannotations.api.ViewServer
        public void setFocusedWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // org.androidannotations.api.ViewServer
        public boolean start() throws java.io.IOException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.androidannotations.api.ViewServer
        public boolean stop() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public static class UncloseableOuputStream extends java.io.OutputStream {
        private final java.io.OutputStream mStream;

        public UncloseableOuputStream(java.io.OutputStream r1) {
                r0 = this;
                r0.<init>()
                r0.mStream = r1
                return
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r0 = this;
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                java.io.OutputStream r0 = r1.mStream
                boolean r2 = r0.equals(r2)
                return r2
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mStream
                r0.flush()
                return
        }

        public int hashCode() {
                r1 = this;
                java.io.OutputStream r0 = r1.mStream
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.io.OutputStream r0 = r1.mStream
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // java.io.OutputStream
        public void write(int r2) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mStream
                r0.write(r2)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mStream
                r0.write(r2)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mStream
                r0.write(r2, r3, r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class ViewServerWorker implements java.lang.Runnable, org.androidannotations.api.ViewServer.WindowListener {
        private java.net.Socket mClient;
        private final java.lang.Object[] mLock;
        private boolean mNeedFocusedWindowUpdate;
        private boolean mNeedWindowListUpdate;
        public final /* synthetic */ org.androidannotations.api.ViewServer this$0;

        public ViewServerWorker(org.androidannotations.api.ViewServer r2, java.net.Socket r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r2 = 0
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r1.mLock = r0
                r1.mClient = r3
                r1.mNeedWindowListUpdate = r2
                r1.mNeedFocusedWindowUpdate = r2
                return
        }

        private android.view.View findWindow(int r4) {
                r3 = this;
                r0 = -1
                if (r4 != r0) goto L33
                org.androidannotations.api.ViewServer r4 = r3.this$0
                java.util.concurrent.locks.ReentrantReadWriteLock r4 = org.androidannotations.api.ViewServer.access$300(r4)
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r4.readLock()
                r4.lock()
                org.androidannotations.api.ViewServer r4 = r3.this$0     // Catch: java.lang.Throwable -> L24
                android.view.View r4 = org.androidannotations.api.ViewServer.access$400(r4)     // Catch: java.lang.Throwable -> L24
                org.androidannotations.api.ViewServer r0 = r3.this$0
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = org.androidannotations.api.ViewServer.access$300(r0)
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r0.unlock()
                return r4
            L24:
                r4 = move-exception
                org.androidannotations.api.ViewServer r0 = r3.this$0
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = org.androidannotations.api.ViewServer.access$300(r0)
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r0.unlock()
                throw r4
            L33:
                org.androidannotations.api.ViewServer r0 = r3.this$0
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = org.androidannotations.api.ViewServer.access$300(r0)
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r0.lock()
                org.androidannotations.api.ViewServer r0 = r3.this$0     // Catch: java.lang.Throwable -> L87
                java.util.HashMap r0 = org.androidannotations.api.ViewServer.access$500(r0)     // Catch: java.lang.Throwable -> L87
                java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L87
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L87
            L4e:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L87
                if (r1 == 0) goto L78
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L87
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L87
                java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L87
                int r2 = java.lang.System.identityHashCode(r2)     // Catch: java.lang.Throwable -> L87
                if (r2 != r4) goto L4e
                java.lang.Object r4 = r1.getKey()     // Catch: java.lang.Throwable -> L87
                android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L87
                org.androidannotations.api.ViewServer r0 = r3.this$0
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = org.androidannotations.api.ViewServer.access$300(r0)
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r0.unlock()
                return r4
            L78:
                org.androidannotations.api.ViewServer r4 = r3.this$0
                java.util.concurrent.locks.ReentrantReadWriteLock r4 = org.androidannotations.api.ViewServer.access$300(r4)
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r4.readLock()
                r4.unlock()
                r4 = 0
                return r4
            L87:
                r4 = move-exception
                org.androidannotations.api.ViewServer r0 = r3.this$0
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = org.androidannotations.api.ViewServer.access$300(r0)
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r0.unlock()
                throw r4
        }

        private boolean getFocusedWindow(java.net.Socket r5) {
                r4 = this;
                r0 = 0
                r1 = 0
                java.io.OutputStream r5 = r5.getOutputStream()     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> Lab
                java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> Lab
                java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> Lab
                r3.<init>(r5)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> Lab
                r5 = 8192(0x2000, float:1.148E-41)
                r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> Lab
                org.androidannotations.api.ViewServer r5 = r4.this$0     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock r5 = org.androidannotations.api.ViewServer.access$600(r5)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r5.readLock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                r5.lock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                org.androidannotations.api.ViewServer r5 = r4.this$0     // Catch: java.lang.Throwable -> L90
                android.view.View r5 = org.androidannotations.api.ViewServer.access$400(r5)     // Catch: java.lang.Throwable -> L90
                org.androidannotations.api.ViewServer r1 = r4.this$0     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock r1 = org.androidannotations.api.ViewServer.access$600(r1)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                r1.unlock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                if (r5 == 0) goto L83
                org.androidannotations.api.ViewServer r1 = r4.this$0     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock r1 = org.androidannotations.api.ViewServer.access$300(r1)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                r1.lock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                org.androidannotations.api.ViewServer r1 = r4.this$0     // Catch: java.lang.Throwable -> L74
                java.util.HashMap r1 = org.androidannotations.api.ViewServer.access$500(r1)     // Catch: java.lang.Throwable -> L74
                org.androidannotations.api.ViewServer r3 = r4.this$0     // Catch: java.lang.Throwable -> L74
                android.view.View r3 = org.androidannotations.api.ViewServer.access$400(r3)     // Catch: java.lang.Throwable -> L74
                java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L74
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L74
                org.androidannotations.api.ViewServer r3 = r4.this$0     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock r3 = org.androidannotations.api.ViewServer.access$300(r3)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                r3.unlock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                int r5 = java.lang.System.identityHashCode(r5)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                r2.write(r5)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                r5 = 32
                r2.write(r5)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                r2.append(r1)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                goto L83
            L74:
                r5 = move-exception
                org.androidannotations.api.ViewServer r1 = r4.this$0     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock r1 = org.androidannotations.api.ViewServer.access$300(r1)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                r1.unlock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                throw r5     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
            L83:
                r5 = 10
                r2.write(r5)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                r2.flush()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                r2.close()     // Catch: java.io.IOException -> Lb1
                r0 = 1
                goto Lb1
            L90:
                r5 = move-exception
                org.androidannotations.api.ViewServer r1 = r4.this$0     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock r1 = org.androidannotations.api.ViewServer.access$600(r1)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                r1.unlock()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
                throw r5     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
            L9f:
                r5 = move-exception
                r1 = r2
                goto La5
            La2:
                r1 = r2
                goto Lac
            La4:
                r5 = move-exception
            La5:
                if (r1 == 0) goto Laa
                r1.close()     // Catch: java.io.IOException -> Laa
            Laa:
                throw r5
            Lab:
            Lac:
                if (r1 == 0) goto Lb1
                r1.close()     // Catch: java.io.IOException -> Lb1
            Lb1:
                return r0
        }

        private boolean listWindows(java.net.Socket r5) {
                r4 = this;
                r0 = 0
                r1 = 0
                org.androidannotations.api.ViewServer r2 = r4.this$0     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L8f
                java.util.concurrent.locks.ReentrantReadWriteLock r2 = org.androidannotations.api.ViewServer.access$300(r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L8f
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r2.readLock()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L8f
                r2.lock()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L8f
                java.io.OutputStream r5 = r5.getOutputStream()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L8f
                java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L8f
                java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L8f
                r3.<init>(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L8f
                r5 = 8192(0x2000, float:1.148E-41)
                r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L8f
                org.androidannotations.api.ViewServer r5 = r4.this$0     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                java.util.HashMap r5 = org.androidannotations.api.ViewServer.access$500(r5)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
            L2d:
                boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                if (r1 == 0) goto L5c
                java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                int r3 = java.lang.System.identityHashCode(r3)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                r2.write(r3)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                r3 = 32
                r2.write(r3)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                r2.append(r1)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                r1 = 10
                r2.write(r1)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                goto L2d
            L5c:
                java.lang.String r5 = "DONE.\n"
                r2.write(r5)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                r2.flush()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
                org.androidannotations.api.ViewServer r5 = r4.this$0
                java.util.concurrent.locks.ReentrantReadWriteLock r5 = org.androidannotations.api.ViewServer.access$300(r5)
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r5.readLock()
                r5.unlock()
                r2.close()     // Catch: java.io.IOException -> La2
                r0 = 1
                goto La2
            L76:
                r5 = move-exception
                r1 = r2
                goto L7c
            L79:
                r1 = r2
                goto L90
            L7b:
                r5 = move-exception
            L7c:
                org.androidannotations.api.ViewServer r0 = r4.this$0
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = org.androidannotations.api.ViewServer.access$300(r0)
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r0.unlock()
                if (r1 == 0) goto L8e
                r1.close()     // Catch: java.io.IOException -> L8e
            L8e:
                throw r5
            L8f:
            L90:
                org.androidannotations.api.ViewServer r5 = r4.this$0
                java.util.concurrent.locks.ReentrantReadWriteLock r5 = org.androidannotations.api.ViewServer.access$300(r5)
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r5.readLock()
                r5.unlock()
                if (r1 == 0) goto La2
                r1.close()     // Catch: java.io.IOException -> La2
            La2:
                return r0
        }

        private boolean windowCommand(java.net.Socket r12, java.lang.String r13, java.lang.String r14) {
                r11 = this;
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r1 = 32
                r2 = 0
                r3 = 1
                r4 = 0
                int r1 = r14.indexOf(r1)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r5 = -1
                if (r1 != r5) goto L12
                int r1 = r14.length()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            L12:
                java.lang.String r5 = r14.substring(r4, r1)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r6 = 16
                long r5 = java.lang.Long.parseLong(r5, r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                int r6 = (int) r5     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                int r5 = r14.length()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                if (r1 >= r5) goto L29
                int r1 = r1 + r3
                java.lang.String r14 = r14.substring(r1)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                goto L2b
            L29:
                java.lang.String r14 = ""
            L2b:
                android.view.View r1 = r11.findWindow(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                if (r1 != 0) goto L32
                return r4
            L32:
                java.lang.Class<android.view.ViewDebug> r5 = android.view.ViewDebug.class
                java.lang.String r6 = "dispatchCommand"
                r7 = 4
                java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                java.lang.Class<android.view.View> r9 = android.view.View.class
                r8[r4] = r9     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r8[r3] = r0     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r9 = 2
                r8[r9] = r0     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                java.lang.Class<java.io.OutputStream> r0 = java.io.OutputStream.class
                r10 = 3
                r8[r10] = r0     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                java.lang.reflect.Method r0 = r5.getDeclaredMethod(r6, r8)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r5[r4] = r1     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r5[r3] = r13     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r5[r9] = r14     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                org.androidannotations.api.ViewServer$UncloseableOuputStream r1 = new org.androidannotations.api.ViewServer$UncloseableOuputStream     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                java.io.OutputStream r6 = r12.getOutputStream()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r1.<init>(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r5[r10] = r1     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r0.invoke(r2, r5)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                boolean r0 = r12.isOutputShutdown()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                if (r0 != 0) goto L88
                java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                java.io.OutputStream r12 = r12.getOutputStream()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r1.<init>(r12)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
                java.lang.String r12 = "DONE\n"
                r0.write(r12)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
                r0.flush()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
                r2 = r0
                goto L88
            L82:
                r12 = move-exception
                r2 = r0
                goto Lb6
            L85:
                r12 = move-exception
                r2 = r0
                goto L91
            L88:
                if (r2 == 0) goto Lb5
                r2.close()     // Catch: java.io.IOException -> Lb4
                goto Lb5
            L8e:
                r12 = move-exception
                goto Lb6
            L90:
                r12 = move-exception
            L91:
                java.lang.String r0 = "ViewServer"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
                r1.<init>()     // Catch: java.lang.Throwable -> L8e
                java.lang.String r3 = "Could not send command "
                r1.append(r3)     // Catch: java.lang.Throwable -> L8e
                r1.append(r13)     // Catch: java.lang.Throwable -> L8e
                java.lang.String r13 = " with parameters "
                r1.append(r13)     // Catch: java.lang.Throwable -> L8e
                r1.append(r14)     // Catch: java.lang.Throwable -> L8e
                java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L8e
                android.util.Log.w(r0, r13, r12)     // Catch: java.lang.Throwable -> L8e
                if (r2 == 0) goto Lb4
                r2.close()     // Catch: java.io.IOException -> Lb4
            Lb4:
                r3 = 0
            Lb5:
                return r3
            Lb6:
                if (r2 == 0) goto Lbb
                r2.close()     // Catch: java.io.IOException -> Lbb
            Lbb:
                throw r12
        }

        private boolean windowManagerAutolistLoop() {
                r7 = this;
                org.androidannotations.api.ViewServer r0 = r7.this$0
                org.androidannotations.api.ViewServer.access$700(r0, r7)
                r0 = 1
                r1 = 0
                java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
                java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
                java.net.Socket r4 = r7.mClient     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
                java.io.OutputStream r4 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            L17:
                boolean r1 = java.lang.Thread.interrupted()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L70
                if (r1 != 0) goto L67
                java.lang.Object[] r1 = r7.mLock     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L70
                monitor-enter(r1)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L70
            L20:
                boolean r3 = r7.mNeedWindowListUpdate     // Catch: java.lang.Throwable -> L53
                if (r3 != 0) goto L2e
                boolean r4 = r7.mNeedFocusedWindowUpdate     // Catch: java.lang.Throwable -> L53
                if (r4 != 0) goto L2e
                java.lang.Object[] r3 = r7.mLock     // Catch: java.lang.Throwable -> L53
                r3.wait()     // Catch: java.lang.Throwable -> L53
                goto L20
            L2e:
                r4 = 0
                if (r3 == 0) goto L35
                r7.mNeedWindowListUpdate = r4     // Catch: java.lang.Throwable -> L53
                r3 = 1
                goto L36
            L35:
                r3 = 0
            L36:
                boolean r5 = r7.mNeedFocusedWindowUpdate     // Catch: java.lang.Throwable -> L53
                if (r5 == 0) goto L3d
                r7.mNeedFocusedWindowUpdate = r4     // Catch: java.lang.Throwable -> L53
                r4 = 1
            L3d:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
                if (r3 == 0) goto L48
                java.lang.String r1 = "LIST UPDATE\n"
                r2.write(r1)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L70
                r2.flush()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L70
            L48:
                if (r4 == 0) goto L17
                java.lang.String r1 = "FOCUS UPDATE\n"
                r2.write(r1)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L70
                r2.flush()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L70
                goto L17
            L53:
                r3 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
                throw r3     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L70
            L56:
                r1 = move-exception
                goto L5e
            L58:
                r0 = move-exception
                goto L72
            L5a:
                r2 = move-exception
                r6 = r2
                r2 = r1
                r1 = r6
            L5e:
                java.lang.String r3 = "ViewServer"
                java.lang.String r4 = "Connection error: "
                android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L70
                if (r2 == 0) goto L6a
            L67:
                r2.close()     // Catch: java.io.IOException -> L6a
            L6a:
                org.androidannotations.api.ViewServer r1 = r7.this$0
                org.androidannotations.api.ViewServer.access$800(r1, r7)
                return r0
            L70:
                r0 = move-exception
                r1 = r2
            L72:
                if (r1 == 0) goto L77
                r1.close()     // Catch: java.io.IOException -> L77
            L77:
                org.androidannotations.api.ViewServer r1 = r7.this$0
                org.androidannotations.api.ViewServer.access$800(r1, r7)
                throw r0
        }

        @Override // org.androidannotations.api.ViewServer.WindowListener
        public void focusChanged() {
                r2 = this;
                java.lang.Object[] r0 = r2.mLock
                monitor-enter(r0)
                r1 = 1
                r2.mNeedFocusedWindowUpdate = r1     // Catch: java.lang.Throwable -> Ld
                java.lang.Object[] r1 = r2.mLock     // Catch: java.lang.Throwable -> Ld
                r1.notifyAll()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.lang.String r0 = "ViewServer"
                r1 = 0
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
                java.net.Socket r4 = r6.mClient     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
                java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
                r3.<init>(r4)     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
                r4 = 1024(0x400, float:1.435E-42)
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
                java.lang.String r1 = r2.readLine()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                r3 = 32
                int r3 = r1.indexOf(r3)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                r4 = -1
                if (r3 != r4) goto L25
                java.lang.String r3 = ""
                goto L31
            L25:
                r4 = 0
                java.lang.String r4 = r1.substring(r4, r3)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                int r3 = r3 + 1
                java.lang.String r3 = r1.substring(r3)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                r1 = r4
            L31:
                java.lang.String r4 = "PROTOCOL"
                boolean r4 = r4.equalsIgnoreCase(r1)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                if (r4 == 0) goto L40
                java.net.Socket r3 = r6.mClient     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                boolean r3 = org.androidannotations.api.ViewServer.access$200(r3)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                goto L80
            L40:
                java.lang.String r4 = "SERVER"
                boolean r4 = r4.equalsIgnoreCase(r1)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                if (r4 == 0) goto L4f
                java.net.Socket r3 = r6.mClient     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                boolean r3 = org.androidannotations.api.ViewServer.access$200(r3)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                goto L80
            L4f:
                java.lang.String r4 = "LIST"
                boolean r4 = r4.equalsIgnoreCase(r1)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                if (r4 == 0) goto L5e
                java.net.Socket r3 = r6.mClient     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                boolean r3 = r6.listWindows(r3)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                goto L80
            L5e:
                java.lang.String r4 = "GET_FOCUS"
                boolean r4 = r4.equalsIgnoreCase(r1)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                if (r4 == 0) goto L6d
                java.net.Socket r3 = r6.mClient     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                boolean r3 = r6.getFocusedWindow(r3)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                goto L80
            L6d:
                java.lang.String r4 = "AUTOLIST"
                boolean r4 = r4.equalsIgnoreCase(r1)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                if (r4 == 0) goto L7a
                boolean r3 = r6.windowManagerAutolistLoop()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                goto L80
            L7a:
                java.net.Socket r4 = r6.mClient     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                boolean r3 = r6.windowCommand(r4, r1, r3)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
            L80:
                if (r3 != 0) goto L96
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                r3.<init>()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                java.lang.String r4 = "An error occurred with the command: "
                r3.append(r4)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                r3.append(r1)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                java.lang.String r1 = r3.toString()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
                android.util.Log.w(r0, r1)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lc7
            L96:
                r2.close()     // Catch: java.io.IOException -> L9a
                goto L9e
            L9a:
                r0 = move-exception
                r0.printStackTrace()
            L9e:
                java.net.Socket r0 = r6.mClient
                if (r0 == 0) goto Lc6
                goto Lbe
            La3:
                r1 = move-exception
                goto Lab
            La5:
                r0 = move-exception
                goto Lc9
            La7:
                r2 = move-exception
                r5 = r2
                r2 = r1
                r1 = r5
            Lab:
                java.lang.String r3 = "Connection error: "
                android.util.Log.w(r0, r3, r1)     // Catch: java.lang.Throwable -> Lc7
                if (r2 == 0) goto Lba
                r2.close()     // Catch: java.io.IOException -> Lb6
                goto Lba
            Lb6:
                r0 = move-exception
                r0.printStackTrace()
            Lba:
                java.net.Socket r0 = r6.mClient
                if (r0 == 0) goto Lc6
            Lbe:
                r0.close()     // Catch: java.io.IOException -> Lc2
                goto Lc6
            Lc2:
                r0 = move-exception
                r0.printStackTrace()
            Lc6:
                return
            Lc7:
                r0 = move-exception
                r1 = r2
            Lc9:
                if (r1 == 0) goto Ld3
                r1.close()     // Catch: java.io.IOException -> Lcf
                goto Ld3
            Lcf:
                r1 = move-exception
                r1.printStackTrace()
            Ld3:
                java.net.Socket r1 = r6.mClient
                if (r1 == 0) goto Ldf
                r1.close()     // Catch: java.io.IOException -> Ldb
                goto Ldf
            Ldb:
                r1 = move-exception
                r1.printStackTrace()
            Ldf:
                throw r0
        }

        @Override // org.androidannotations.api.ViewServer.WindowListener
        public void windowsChanged() {
                r2 = this;
                java.lang.Object[] r0 = r2.mLock
                monitor-enter(r0)
                r1 = 1
                r2.mNeedWindowListUpdate = r1     // Catch: java.lang.Throwable -> Ld
                java.lang.Object[] r1 = r2.mLock     // Catch: java.lang.Throwable -> Ld
                r1.notifyAll()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface WindowListener {
        void focusChanged();

        void windowsChanged();
    }

    private ViewServer() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mListeners = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mWindows = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.mWindowsLock = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.mFocusLock = r0
            r0 = -1
            r1.mPort = r0
            return
    }

    private ViewServer(int r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mListeners = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mWindows = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.mWindowsLock = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.mFocusLock = r0
            r1.mPort = r2
            return
    }

    public /* synthetic */ ViewServer(org.androidannotations.api.ViewServer.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean access$200(java.net.Socket r1) {
            java.lang.String r0 = "4"
            boolean r1 = writeValue(r1, r0)
            return r1
    }

    public static /* synthetic */ java.util.concurrent.locks.ReentrantReadWriteLock access$300(org.androidannotations.api.ViewServer r0) {
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.mWindowsLock
            return r0
    }

    public static /* synthetic */ android.view.View access$400(org.androidannotations.api.ViewServer r0) {
            android.view.View r0 = r0.mFocusedWindow
            return r0
    }

    public static /* synthetic */ java.util.HashMap access$500(org.androidannotations.api.ViewServer r0) {
            java.util.HashMap<android.view.View, java.lang.String> r0 = r0.mWindows
            return r0
    }

    public static /* synthetic */ java.util.concurrent.locks.ReentrantReadWriteLock access$600(org.androidannotations.api.ViewServer r0) {
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.mFocusLock
            return r0
    }

    public static /* synthetic */ void access$700(org.androidannotations.api.ViewServer r0, org.androidannotations.api.ViewServer.WindowListener r1) {
            r0.addWindowListener(r1)
            return
    }

    public static /* synthetic */ void access$800(org.androidannotations.api.ViewServer r0, org.androidannotations.api.ViewServer.WindowListener r1) {
            r0.removeWindowListener(r1)
            return
    }

    private void addWindowListener(org.androidannotations.api.ViewServer.WindowListener r2) {
            r1 = this;
            java.util.List<org.androidannotations.api.ViewServer$WindowListener> r0 = r1.mListeners
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.List<org.androidannotations.api.ViewServer$WindowListener> r0 = r1.mListeners
            r0.add(r2)
        Ld:
            return
    }

    private void fireFocusChangedEvent() {
            r2 = this;
            java.util.List<org.androidannotations.api.ViewServer$WindowListener> r0 = r2.mListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            org.androidannotations.api.ViewServer$WindowListener r1 = (org.androidannotations.api.ViewServer.WindowListener) r1
            r1.focusChanged()
            goto L6
        L16:
            return
    }

    private void fireWindowsChangedEvent() {
            r2 = this;
            java.util.List<org.androidannotations.api.ViewServer$WindowListener> r0 = r2.mListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            org.androidannotations.api.ViewServer$WindowListener r1 = (org.androidannotations.api.ViewServer.WindowListener) r1
            r1.windowsChanged()
            goto L6
        L16:
            return
    }

    public static org.androidannotations.api.ViewServer get(android.content.Context r2) {
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r0 = android.os.Build.TYPE
            java.lang.String r1 = "user"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L39
            int r2 = r2.flags
            r2 = r2 & 2
            if (r2 == 0) goto L39
            org.androidannotations.api.ViewServer r2 = org.androidannotations.api.ViewServer.sServer
            if (r2 != 0) goto L22
            org.androidannotations.api.ViewServer r2 = new org.androidannotations.api.ViewServer
            r0 = 4939(0x134b, float:6.921E-42)
            r2.<init>(r0)
            org.androidannotations.api.ViewServer.sServer = r2
        L22:
            org.androidannotations.api.ViewServer r2 = org.androidannotations.api.ViewServer.sServer
            boolean r2 = r2.isRunning()
            if (r2 != 0) goto L41
            org.androidannotations.api.ViewServer r2 = org.androidannotations.api.ViewServer.sServer     // Catch: java.io.IOException -> L30
            r2.start()     // Catch: java.io.IOException -> L30
            goto L41
        L30:
            r2 = move-exception
            java.lang.String r0 = "ViewServer"
            java.lang.String r1 = "Error:"
            android.util.Log.d(r0, r1, r2)
            goto L41
        L39:
            org.androidannotations.api.ViewServer$NoopViewServer r2 = new org.androidannotations.api.ViewServer$NoopViewServer
            r0 = 0
            r2.<init>(r0)
            org.androidannotations.api.ViewServer.sServer = r2
        L41:
            org.androidannotations.api.ViewServer r2 = org.androidannotations.api.ViewServer.sServer
            return r2
    }

    private void removeWindowListener(org.androidannotations.api.ViewServer.WindowListener r2) {
            r1 = this;
            java.util.List<org.androidannotations.api.ViewServer$WindowListener> r0 = r1.mListeners
            r0.remove(r2)
            return
    }

    private static boolean writeValue(java.net.Socket r4, java.lang.String r5) {
            r0 = 0
            r1 = 0
            java.io.OutputStream r4 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            r4 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            r2.write(r5)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26
            java.lang.String r4 = "\n"
            r2.write(r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26
            r2.flush()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26
            r4 = 1
            r2.close()     // Catch: java.io.IOException -> L35
            r0 = 1
            goto L35
        L23:
            r4 = move-exception
            r1 = r2
            goto L29
        L26:
            r1 = r2
            goto L30
        L28:
            r4 = move-exception
        L29:
            if (r1 == 0) goto L2e
            r1.close()     // Catch: java.io.IOException -> L2e
        L2e:
            throw r4
        L2f:
        L30:
            if (r1 == 0) goto L35
            r1.close()     // Catch: java.io.IOException -> L35
        L35:
            return r0
    }

    public void addWindow(android.app.Activity r3) {
            r2 = this;
            java.lang.CharSequence r0 = r3.getTitle()
            java.lang.String r0 = r0.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            r0.append(r1)
            java.lang.String r1 = "/0x"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L49
        L2f:
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r1)
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L49:
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r2.addWindow(r3, r0)
            return
    }

    public void addWindow(android.view.View r2, java.lang.String r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.mWindowsLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.HashMap<android.view.View, java.lang.String> r0 = r1.mWindows     // Catch: java.lang.Throwable -> L1f
            android.view.View r2 = r2.getRootView()     // Catch: java.lang.Throwable -> L1f
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r1.mWindowsLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.unlock()
            r1.fireWindowsChangedEvent()
            return
        L1f:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r1.mWindowsLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r3.writeLock()
            r3.unlock()
            throw r2
    }

    public boolean isRunning() {
            r1 = this;
            java.lang.Thread r0 = r1.mThread
            if (r0 == 0) goto Lc
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void removeWindow(android.app.Activity r1) {
            r0 = this;
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.removeWindow(r1)
            return
    }

    public void removeWindow(android.view.View r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.mWindowsLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.HashMap<android.view.View, java.lang.String> r0 = r1.mWindows     // Catch: java.lang.Throwable -> L1f
            android.view.View r2 = r2.getRootView()     // Catch: java.lang.Throwable -> L1f
            r0.remove(r2)     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r1.mWindowsLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.unlock()
            r1.fireWindowsChangedEvent()
            return
        L1f:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.mWindowsLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.unlock()
            throw r2
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            java.lang.String r0 = "ViewServer"
            java.net.ServerSocket r1 = new java.net.ServerSocket     // Catch: java.lang.Exception -> L12
            int r2 = r5.mPort     // Catch: java.lang.Exception -> L12
            r3 = 10
            java.net.InetAddress r4 = java.net.InetAddress.getLocalHost()     // Catch: java.lang.Exception -> L12
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Exception -> L12
            r5.mServer = r1     // Catch: java.lang.Exception -> L12
            goto L18
        L12:
            r1 = move-exception
            java.lang.String r2 = "Starting ServerSocket error: "
            android.util.Log.w(r0, r2, r1)
        L18:
            java.net.ServerSocket r1 = r5.mServer
            if (r1 == 0) goto L47
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread r2 = r5.mThread
            if (r1 != r2) goto L47
            java.net.ServerSocket r1 = r5.mServer     // Catch: java.lang.Exception -> L40
            java.net.Socket r1 = r1.accept()     // Catch: java.lang.Exception -> L40
            java.util.concurrent.ExecutorService r2 = r5.mThreadPool     // Catch: java.lang.Exception -> L40
            if (r2 == 0) goto L37
            org.androidannotations.api.ViewServer$ViewServerWorker r3 = new org.androidannotations.api.ViewServer$ViewServerWorker     // Catch: java.lang.Exception -> L40
            r3.<init>(r5, r1)     // Catch: java.lang.Exception -> L40
            r2.submit(r3)     // Catch: java.lang.Exception -> L40
            goto L18
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b java.lang.Exception -> L40
            goto L18
        L3b:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Exception -> L40
            goto L18
        L40:
            r1 = move-exception
            java.lang.String r2 = "Connection error: "
            android.util.Log.w(r0, r2, r1)
            goto L18
        L47:
            return
    }

    public void setFocusedWindow(android.app.Activity r1) {
            r0 = this;
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.setFocusedWindow(r1)
            return
    }

    public void setFocusedWindow(android.view.View r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.mFocusLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            if (r2 != 0) goto Ld
            r2 = 0
            goto L11
        Ld:
            android.view.View r2 = r2.getRootView()     // Catch: java.lang.Throwable -> L20
        L11:
            r1.mFocusedWindow = r2     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r1.mFocusLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.unlock()
            r1.fireFocusChangedEvent()
            return
        L20:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.mFocusLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.unlock()
            throw r2
    }

    public boolean start() throws java.io.IOException {
            r4 = this;
            java.lang.Thread r0 = r4.mThread
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = "Local View Server [port="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r4.mPort
            java.lang.String r3 = "]"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
            r0.<init>(r4, r1)
            r4.mThread = r0
            r0 = 10
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            r4.mThreadPool = r0
            java.lang.Thread r0 = r4.mThread
            r0.start()
            r0 = 1
            return r0
    }

    public boolean stop() {
            r3 = this;
            java.lang.Thread r0 = r3.mThread
            r1 = 0
            if (r0 == 0) goto L29
            r0.interrupt()
            java.util.concurrent.ExecutorService r0 = r3.mThreadPool
            java.lang.String r2 = "ViewServer"
            if (r0 == 0) goto L17
            r0.shutdownNow()     // Catch: java.lang.SecurityException -> L12
            goto L17
        L12:
            java.lang.String r0 = "Could not stop all view server threads"
            android.util.Log.w(r2, r0)
        L17:
            r3.mThreadPool = r1
            r3.mThread = r1
            java.net.ServerSocket r0 = r3.mServer     // Catch: java.io.IOException -> L24
            r0.close()     // Catch: java.io.IOException -> L24
            r3.mServer = r1     // Catch: java.io.IOException -> L24
            r0 = 1
            return r0
        L24:
            java.lang.String r0 = "Could not close the view server"
            android.util.Log.w(r2, r0)
        L29:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.mWindowsLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.HashMap<android.view.View, java.lang.String> r0 = r3.mWindows     // Catch: java.lang.Throwable -> L61
            r0.clear()     // Catch: java.lang.Throwable -> L61
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.mWindowsLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.unlock()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.mFocusLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r3.mFocusedWindow = r1     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.mFocusLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.unlock()
            r0 = 0
            return r0
        L56:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.mFocusLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.unlock()
            throw r0
        L61:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.mWindowsLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.unlock()
            throw r0
    }
}
