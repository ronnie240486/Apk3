package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ExperimentalUrlRequest extends org.chromium.net.UrlRequest {

    public static abstract class Builder extends org.chromium.net.UrlRequest.Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder addHeader(java.lang.String r1, java.lang.String r2);

        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder addHeader(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                org.chromium.net.ExperimentalUrlRequest$Builder r1 = r0.addHeader(r1, r2)
                return r1
        }

        public org.chromium.net.ExperimentalUrlRequest.Builder addRequestAnnotation(java.lang.Object r1) {
                r0 = this;
                return r0
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder allowDirectExecutor();

        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder allowDirectExecutor() {
                r1 = this;
                org.chromium.net.ExperimentalUrlRequest$Builder r0 = r1.allowDirectExecutor()
                return r0
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest build();

        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest build() {
                r1 = this;
                org.chromium.net.ExperimentalUrlRequest r0 = r1.build()
                return r0
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder disableCache();

        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder disableCache() {
                r1 = this;
                org.chromium.net.ExperimentalUrlRequest$Builder r0 = r1.disableCache()
                return r0
        }

        public org.chromium.net.ExperimentalUrlRequest.Builder disableConnectionMigration() {
                r0 = this;
                return r0
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setHttpMethod(java.lang.String r1);

        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder setHttpMethod(java.lang.String r1) {
                r0 = this;
                org.chromium.net.ExperimentalUrlRequest$Builder r1 = r0.setHttpMethod(r1)
                return r1
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setPriority(int r1);

        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder setPriority(int r1) {
                r0 = this;
                org.chromium.net.ExperimentalUrlRequest$Builder r1 = r0.setPriority(r1)
                return r1
        }

        public org.chromium.net.ExperimentalUrlRequest.Builder setRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener r1) {
                r0 = this;
                return r0
        }

        public org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsTag(int r1) {
                r0 = this;
                return r0
        }

        public org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsUid(int r1) {
                r0 = this;
                return r0
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setUploadDataProvider(org.chromium.net.UploadDataProvider r1, java.util.concurrent.Executor r2);

        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder setUploadDataProvider(org.chromium.net.UploadDataProvider r1, java.util.concurrent.Executor r2) {
                r0 = this;
                org.chromium.net.ExperimentalUrlRequest$Builder r1 = r0.setUploadDataProvider(r1, r2)
                return r1
        }
    }

    public ExperimentalUrlRequest() {
            r0 = this;
            r0.<init>()
            return
    }
}
