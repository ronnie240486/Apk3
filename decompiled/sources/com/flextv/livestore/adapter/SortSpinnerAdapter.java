package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class SortSpinnerAdapter extends android.widget.BaseAdapter {
    public android.content.Context context;
    public java.util.List<java.lang.String> names;

    public SortSpinnerAdapter(android.content.Context r1, java.util.List<java.lang.String> r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.names = r2
            return
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.names
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.size()
        La:
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.names
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            android.content.Context r4 = r2.context
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131624065(0x7f0e0081, float:1.88753E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
            r5 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.util.List<java.lang.String> r0 = r2.names
            java.lang.Object r3 = r0.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5.setText(r3)
            return r4
    }
}
