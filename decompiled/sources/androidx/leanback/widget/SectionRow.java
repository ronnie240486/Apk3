package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
public class SectionRow extends androidx.leanback.widget.Row {
    public SectionRow(long r2, java.lang.String r4) {
            r1 = this;
            androidx.leanback.widget.HeaderItem r0 = new androidx.leanback.widget.HeaderItem
            r0.<init>(r2, r4)
            r1.<init>(r0)
            return
    }

    public SectionRow(androidx.leanback.widget.HeaderItem r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public SectionRow(java.lang.String r2) {
            r1 = this;
            androidx.leanback.widget.HeaderItem r0 = new androidx.leanback.widget.HeaderItem
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    @Override // androidx.leanback.widget.Row
    public final boolean isRenderedAsRowView() {
            r1 = this;
            r0 = 0
            return r0
    }
}
