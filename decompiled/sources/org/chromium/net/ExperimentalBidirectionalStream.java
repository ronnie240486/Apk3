package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ExperimentalBidirectionalStream extends org.chromium.net.BidirectionalStream {

    public static abstract class Builder extends org.chromium.net.BidirectionalStream.Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder addHeader(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                org.chromium.net.ExperimentalBidirectionalStream$Builder r1 = r0.addHeader(r1, r2)
                return r1
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder addHeader(java.lang.String r1, java.lang.String r2);

        public org.chromium.net.ExperimentalBidirectionalStream.Builder addRequestAnnotation(java.lang.Object r1) {
                r0 = this;
                return r0
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream build() {
                r1 = this;
                org.chromium.net.ExperimentalBidirectionalStream r0 = r1.build()
                return r0
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract org.chromium.net.ExperimentalBidirectionalStream build();

        @Override // org.chromium.net.BidirectionalStream.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean r1) {
                r0 = this;
                org.chromium.net.ExperimentalBidirectionalStream$Builder r1 = r0.delayRequestHeadersUntilFirstFlush(r1)
                return r1
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean r1);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder setHttpMethod(java.lang.String r1) {
                r0 = this;
                org.chromium.net.ExperimentalBidirectionalStream$Builder r1 = r0.setHttpMethod(r1)
                return r1
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder setHttpMethod(java.lang.String r1);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder setPriority(int r1) {
                r0 = this;
                org.chromium.net.ExperimentalBidirectionalStream$Builder r1 = r0.setPriority(r1)
                return r1
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder setPriority(int r1);

        public org.chromium.net.ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int r1) {
                r0 = this;
                return r0
        }

        public org.chromium.net.ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int r1) {
                r0 = this;
                return r0
        }
    }

    public ExperimentalBidirectionalStream() {
            r0 = this;
            r0.<init>()
            return
    }
}
