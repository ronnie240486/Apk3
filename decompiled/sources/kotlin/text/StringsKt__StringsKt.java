package kotlin.text;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\n\u001a\u0018\u0010\u0017\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a:\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001aE\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b!\u001a:\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010#\u001a\u00020\u0010*\u00020\u00022\u0006\u0010$\u001a\u00020\u0006\u001a7\u0010%\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a7\u0010+\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a;\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b.\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u00100\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u00100\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\r\u00103\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00104\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00105\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a \u00106\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00107\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00108\u001a\u000209*\u00020\u0002H\u0086\u0002\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u0010;\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u0002\u001a\u0010\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u0002\u001a\u0015\u0010@\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\f\u001a\u000f\u0010A\u001a\u00020\r*\u0004\u0018\u00010\rH\u0087\b\u001a\u001c\u0010B\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010B\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001aG\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010J\u001a=\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u0006\u0010G\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bI\u001a4\u0010K\u001a\u00020\u0010*\u00020\u00022\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u0002\u001a\u001a\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006\u001a\u0012\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001H\u0087\b\u001a\u0012\u0010R\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010R\u001a\u00020\r*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a.\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\b\u0010V\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000\u001a\u001d\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001d\u0010_\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140WH\u0087\bø\u0001\u0000¢\u0006\u0002\ba\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000¢\u0006\u0002\bb\u001a\"\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002\u001a\u001a\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002\u001a%\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a\u001d\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a=\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010e\u001a0\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a/\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010T\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bf\u001a%\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a=\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010h\u001a0\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a%\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a$\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010j\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010j\u001a\u00020\u0002*\u00020\r2\u0006\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006H\u0087\b\u001a\u001f\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0012\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u0012\u0010m\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\f\u0010r\u001a\u00020\u0010*\u00020\rH\u0007\u001a\u0013\u0010s\u001a\u0004\u0018\u00010\u0010*\u00020\rH\u0007¢\u0006\u0002\u0010t\u001a\n\u0010u\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010u\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010u\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010u\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010w\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010w\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010w\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010w\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010x\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010x\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010x\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010x\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006y"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "requireNonNegativeLimit", "", "limit", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringsKt extends kotlin.text.StringsKt__StringsJVMKt {




    public StringsKt__StringsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ kotlin.Pair access$findAnyOf(java.lang.CharSequence r0, java.util.Collection r1, int r2, boolean r3, boolean r4) {
            kotlin.Pair r0 = findAnyOf$StringsKt__StringsKt(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonPrefixWith(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6, boolean r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.length()
            int r1 = r6.length()
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = 0
        L18:
            if (r2 >= r0) goto L2b
            char r3 = r5.charAt(r2)
            char r4 = r6.charAt(r2)
            boolean r3 = kotlin.text.CharsKt__CharKt.equals(r3, r4, r7)
            if (r3 == 0) goto L2b
            int r2 = r2 + 1
            goto L18
        L2b:
            int r7 = r2 + (-1)
            boolean r0 = hasSurrogatePairAt(r5, r7)
            if (r0 != 0) goto L39
            boolean r6 = hasSurrogatePairAt(r6, r7)
            if (r6 == 0) goto L3b
        L39:
            int r2 = r2 + (-1)
        L3b:
            java.lang.CharSequence r5 = r5.subSequence(r1, r2)
            java.lang.String r5 = r5.toString()
            return r5
    }

    public static /* synthetic */ java.lang.String commonPrefixWith$default(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r0 = commonPrefixWith(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonSuffixWith(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull java.lang.CharSequence r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r6.length()
            int r1 = r7.length()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
        L17:
            if (r3 >= r2) goto L32
            int r4 = r0 - r3
            int r4 = r4 + (-1)
            char r4 = r6.charAt(r4)
            int r5 = r1 - r3
            int r5 = r5 + (-1)
            char r5 = r7.charAt(r5)
            boolean r4 = kotlin.text.CharsKt__CharKt.equals(r4, r5, r8)
            if (r4 == 0) goto L32
            int r3 = r3 + 1
            goto L17
        L32:
            int r8 = r0 - r3
            int r8 = r8 + (-1)
            boolean r8 = hasSurrogatePairAt(r6, r8)
            if (r8 != 0) goto L45
            int r1 = r1 - r3
            int r1 = r1 + (-1)
            boolean r7 = hasSurrogatePairAt(r7, r1)
            if (r7 == 0) goto L47
        L45:
            int r3 = r3 + (-1)
        L47:
            int r7 = r0 - r3
            java.lang.CharSequence r6 = r6.subSequence(r7, r0)
            java.lang.String r6 = r6.toString()
            return r6
    }

    public static /* synthetic */ java.lang.String commonSuffixWith$default(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r0 = commonSuffixWith(r0, r1, r2)
            return r0
    }

    public static final boolean contains(@org.jetbrains.annotations.NotNull java.lang.CharSequence r7, char r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            r2 = r8
            r4 = r9
            int r7 = indexOf$default(r1, r2, r3, r4, r5, r6)
            if (r7 < 0) goto L13
            r7 = 1
            goto L14
        L13:
            r7 = 0
        L14:
            return r7
    }

    public static final boolean contains(@org.jetbrains.annotations.NotNull java.lang.CharSequence r9, @org.jetbrains.annotations.NotNull java.lang.CharSequence r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r10 instanceof java.lang.String
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1f
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            r7 = 2
            r8 = 0
            r3 = r9
            r6 = r11
            int r9 = indexOf$default(r3, r4, r5, r6, r7, r8)
            if (r9 < 0) goto L2f
            goto L30
        L1f:
            r5 = 0
            int r6 = r9.length()
            r8 = 0
            r3 = r9
            r4 = r10
            r7 = r11
            int r9 = indexOf$StringsKt__StringsKt(r3, r4, r5, r6, r7, r8)
            if (r9 < 0) goto L2f
            goto L30
        L2f:
            r1 = 0
        L30:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean contains(java.lang.CharSequence r1, kotlin.text.Regex r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r1 = r2.containsMatchIn(r1)
            return r1
    }

    public static /* synthetic */ boolean contains$default(java.lang.CharSequence r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = contains(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ boolean contains$default(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = contains(r0, r1, r2)
            return r0
    }

    public static final boolean contentEqualsIgnoreCaseImpl(@org.jetbrains.annotations.Nullable java.lang.CharSequence r6, @org.jetbrains.annotations.Nullable java.lang.CharSequence r7) {
            boolean r0 = r6 instanceof java.lang.String
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            boolean r6 = kotlin.text.StringsKt__StringsJVMKt.equals(r6, r7, r1)
            return r6
        L12:
            if (r6 != r7) goto L15
            return r1
        L15:
            r0 = 0
            if (r6 == 0) goto L3f
            if (r7 == 0) goto L3f
            int r2 = r6.length()
            int r3 = r7.length()
            if (r2 == r3) goto L25
            goto L3f
        L25:
            int r2 = r6.length()
            r3 = 0
        L2a:
            if (r3 >= r2) goto L3e
            char r4 = r6.charAt(r3)
            char r5 = r7.charAt(r3)
            boolean r4 = kotlin.text.CharsKt__CharKt.equals(r4, r5, r1)
            if (r4 != 0) goto L3b
            return r0
        L3b:
            int r3 = r3 + 1
            goto L2a
        L3e:
            return r1
        L3f:
            return r0
    }

    public static final boolean contentEqualsImpl(@org.jetbrains.annotations.Nullable java.lang.CharSequence r6, @org.jetbrains.annotations.Nullable java.lang.CharSequence r7) {
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto Ld
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto Ld
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            return r6
        Ld:
            r0 = 1
            if (r6 != r7) goto L11
            return r0
        L11:
            r1 = 0
            if (r6 == 0) goto L37
            if (r7 == 0) goto L37
            int r2 = r6.length()
            int r3 = r7.length()
            if (r2 == r3) goto L21
            goto L37
        L21:
            int r2 = r6.length()
            r3 = 0
        L26:
            if (r3 >= r2) goto L36
            char r4 = r6.charAt(r3)
            char r5 = r7.charAt(r3)
            if (r4 == r5) goto L33
            return r1
        L33:
            int r3 = r3 + 1
            goto L26
        L36:
            return r0
        L37:
            return r1
    }

    public static final boolean endsWith(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, char r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L1b
            int r0 = getLastIndex(r1)
            char r1 = r1.charAt(r0)
            boolean r1 = kotlin.text.CharsKt__CharKt.equals(r1, r2, r3)
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
    }

    public static final boolean endsWith(@org.jetbrains.annotations.NotNull java.lang.CharSequence r8, @org.jetbrains.annotations.NotNull java.lang.CharSequence r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            if (r10 != 0) goto L21
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L21
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L21
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            r0 = 2
            r1 = 0
            boolean r8 = kotlin.text.StringsKt__StringsJVMKt.endsWith$default(r8, r9, r10, r0, r1)
            return r8
        L21:
            int r0 = r8.length()
            int r1 = r9.length()
            int r3 = r0 - r1
            r5 = 0
            int r6 = r9.length()
            r2 = r8
            r4 = r9
            r7 = r10
            boolean r8 = regionMatchesImpl(r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ boolean endsWith$default(java.lang.CharSequence r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = endsWith(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ boolean endsWith$default(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = endsWith(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.Pair<java.lang.Integer, java.lang.String> findAnyOf(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            kotlin.Pair r1 = findAnyOf$StringsKt__StringsKt(r1, r2, r3, r4, r0)
            return r1
    }

    private static final kotlin.Pair<java.lang.Integer, java.lang.String> findAnyOf$StringsKt__StringsKt(java.lang.CharSequence r10, java.util.Collection<java.lang.String> r11, int r12, boolean r13, boolean r14) {
            r0 = 0
            if (r13 != 0) goto L2d
            int r1 = r11.size()
            r2 = 1
            if (r1 != r2) goto L2d
            java.lang.Object r11 = kotlin.collections.CollectionsKt.single(r11)
            java.lang.String r11 = (java.lang.String) r11
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            if (r14 != 0) goto L1d
            int r10 = indexOf$default(r1, r2, r3, r4, r5, r6)
            goto L21
        L1d:
            int r10 = lastIndexOf$default(r1, r2, r3, r4, r5, r6)
        L21:
            if (r10 >= 0) goto L24
            goto L2c
        L24:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r10, r11)
        L2c:
            return r0
        L2d:
            r1 = 0
            if (r14 != 0) goto L3e
            kotlin.ranges.IntRange r14 = new kotlin.ranges.IntRange
            int r12 = kotlin.ranges.RangesKt.coerceAtLeast(r12, r1)
            int r1 = r10.length()
            r14.<init>(r12, r1)
            goto L4a
        L3e:
            int r14 = getLastIndex(r10)
            int r12 = kotlin.ranges.RangesKt.coerceAtMost(r12, r14)
            kotlin.ranges.IntProgression r14 = kotlin.ranges.RangesKt.downTo(r12, r1)
        L4a:
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L96
            int r12 = r14.getFirst()
            int r1 = r14.getLast()
            int r14 = r14.getStep()
            if (r14 <= 0) goto L5e
            if (r12 <= r1) goto L62
        L5e:
            if (r14 >= 0) goto Ldc
            if (r1 > r12) goto Ldc
        L62:
            java.util.Iterator r8 = r11.iterator()
        L66:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.length()
            r5 = r12
            r7 = r13
            boolean r2 = kotlin.text.StringsKt__StringsJVMKt.regionMatches(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L66
            goto L85
        L84:
            r9 = r0
        L85:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L92
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r9)
            return r10
        L92:
            if (r12 == r1) goto Ldc
            int r12 = r12 + r14
            goto L62
        L96:
            int r12 = r14.getFirst()
            int r1 = r14.getLast()
            int r14 = r14.getStep()
            if (r14 <= 0) goto La6
            if (r12 <= r1) goto Laa
        La6:
            if (r14 >= 0) goto Ldc
            if (r1 > r12) goto Ldc
        Laa:
            java.util.Iterator r8 = r11.iterator()
        Lae:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r6 = r2.length()
            r4 = r10
            r5 = r12
            r7 = r13
            boolean r2 = regionMatchesImpl(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto Lae
            goto Lcb
        Lca:
            r9 = r0
        Lcb:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto Ld8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r9)
            return r10
        Ld8:
            if (r12 == r1) goto Ldc
            int r12 = r12 + r14
            goto Laa
        Ldc:
            return r0
    }

    public static /* synthetic */ kotlin.Pair findAnyOf$default(java.lang.CharSequence r1, java.util.Collection r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            kotlin.Pair r1 = findAnyOf(r1, r2, r3, r4)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.Pair<java.lang.Integer, java.lang.String> findLastAnyOf(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            kotlin.Pair r1 = findAnyOf$StringsKt__StringsKt(r1, r2, r3, r4, r0)
            return r1
    }

    public static /* synthetic */ kotlin.Pair findLastAnyOf$default(java.lang.CharSequence r0, java.util.Collection r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = getLastIndex(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            kotlin.Pair r0 = findLastAnyOf(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.IntRange getIndices(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r2 = r2.length()
            int r2 = r2 + (-1)
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static int getLastIndex(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.length()
            int r1 = r1 + (-1)
            return r1
    }

    public static final boolean hasSurrogatePairAt(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r3.length()
            int r1 = r1 + (-2)
            r2 = 0
            r0.<init>(r2, r1)
            boolean r0 = r0.contains(r4)
            r1 = 1
            if (r0 == 0) goto L2e
            char r0 = r3.charAt(r4)
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 == 0) goto L2e
            int r4 = r4 + r1
            char r3 = r3.charAt(r4)
            boolean r3 = java.lang.Character.isLowSurrogate(r3)
            if (r3 == 0) goto L2e
            r2 = 1
        L2e:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <C extends java.lang.CharSequence & R, R> R ifBlank(C r1, kotlin.jvm.functions.Function0<? extends R> r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r1)
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r2.invoke()
        Lf:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <C extends java.lang.CharSequence & R, R> R ifEmpty(C r1, kotlin.jvm.functions.Function0<? extends R> r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.length()
            if (r0 != 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L14
            java.lang.Object r1 = r2.invoke()
        L14:
            return r1
    }

    public static final int indexOf(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, char r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r5 != 0) goto L13
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto Lc
            goto L13
        Lc:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.indexOf(r3, r4)
            goto L1d
        L13:
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r0[r1] = r3
            int r2 = indexOfAny(r2, r0, r4, r5)
        L1d:
            return r2
    }

    public static final int indexOf(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull java.lang.String r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            if (r9 != 0) goto L19
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto L12
            goto L19
        L12:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            goto L26
        L19:
            int r3 = r6.length()
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            int r6 = indexOf$StringsKt__StringsKt(r0, r1, r2, r3, r4, r5)
        L26:
            return r6
    }

    private static final int indexOf$StringsKt__StringsKt(java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11) {
            r0 = 0
            if (r11 != 0) goto L15
            kotlin.ranges.IntRange r11 = new kotlin.ranges.IntRange
            int r8 = kotlin.ranges.RangesKt.coerceAtLeast(r8, r0)
            int r0 = r6.length()
            int r9 = kotlin.ranges.RangesKt.coerceAtMost(r9, r0)
            r11.<init>(r8, r9)
            goto L25
        L15:
            int r11 = getLastIndex(r6)
            int r8 = kotlin.ranges.RangesKt.coerceAtMost(r8, r11)
            int r9 = kotlin.ranges.RangesKt.coerceAtLeast(r9, r0)
            kotlin.ranges.IntProgression r11 = kotlin.ranges.RangesKt.downTo(r8, r9)
        L25:
            boolean r8 = r6 instanceof java.lang.String
            if (r8 == 0) goto L59
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L59
            int r8 = r11.getFirst()
            int r9 = r11.getLast()
            int r11 = r11.getStep()
            if (r11 <= 0) goto L3d
            if (r8 <= r9) goto L41
        L3d:
            if (r11 >= 0) goto L81
            if (r9 > r8) goto L81
        L41:
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r7.length()
            r3 = r8
            r5 = r10
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.regionMatches(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L55
            return r8
        L55:
            if (r8 == r9) goto L81
            int r8 = r8 + r11
            goto L41
        L59:
            int r8 = r11.getFirst()
            int r9 = r11.getLast()
            int r11 = r11.getStep()
            if (r11 <= 0) goto L69
            if (r8 <= r9) goto L6d
        L69:
            if (r11 >= 0) goto L81
            if (r9 > r8) goto L81
        L6d:
            r1 = 0
            int r4 = r7.length()
            r0 = r7
            r2 = r6
            r3 = r8
            r5 = r10
            boolean r0 = regionMatchesImpl(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L7d
            return r8
        L7d:
            if (r8 == r9) goto L81
            int r8 = r8 + r11
            goto L6d
        L81:
            r6 = -1
            return r6
    }

    public static /* synthetic */ int indexOf$default(java.lang.CharSequence r1, char r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            int r1 = indexOf(r1, r2, r3, r4)
            return r1
    }

    public static /* synthetic */ int indexOf$default(java.lang.CharSequence r1, java.lang.String r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            int r1 = indexOf(r1, r2, r3, r4)
            return r1
    }

    public static final int indexOfAny(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            kotlin.Pair r1 = findAnyOf$StringsKt__StringsKt(r1, r2, r3, r4, r0)
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r1.getFirst()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L1e
        L1d:
            r1 = -1
        L1e:
            return r1
    }

    public static final int indexOfAny(@org.jetbrains.annotations.NotNull java.lang.CharSequence r7, @org.jetbrains.annotations.NotNull char[] r8, int r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1
            if (r10 != 0) goto L1f
            int r1 = r8.length
            if (r1 != r0) goto L1f
            boolean r1 = r7 instanceof java.lang.String
            if (r1 == 0) goto L1f
            char r8 = kotlin.collections.ArraysKt.single(r8)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = r7.indexOf(r8, r9)
            return r7
        L1f:
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
            r2 = 0
            int r9 = kotlin.ranges.RangesKt.coerceAtLeast(r9, r2)
            int r3 = getLastIndex(r7)
            r1.<init>(r9, r3)
            kotlin.collections.IntIterator r9 = r1.iterator2()
        L31:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L54
            int r1 = r9.nextInt()
            char r3 = r7.charAt(r1)
            int r4 = r8.length
            r5 = 0
        L41:
            if (r5 >= r4) goto L50
            char r6 = r8[r5]
            boolean r6 = kotlin.text.CharsKt__CharKt.equals(r6, r3, r10)
            if (r6 == 0) goto L4d
            r3 = 1
            goto L51
        L4d:
            int r5 = r5 + 1
            goto L41
        L50:
            r3 = 0
        L51:
            if (r3 == 0) goto L31
            return r1
        L54:
            r7 = -1
            return r7
    }

    public static /* synthetic */ int indexOfAny$default(java.lang.CharSequence r1, java.util.Collection r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            int r1 = indexOfAny(r1, r2, r3, r4)
            return r1
    }

    public static /* synthetic */ int indexOfAny$default(java.lang.CharSequence r1, char[] r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            int r1 = indexOfAny(r1, r2, r3, r4)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean isEmpty(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.length()
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean isNotBlank(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r1)
            r1 = r1 ^ 1
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean isNotEmpty(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.length()
            if (r1 <= 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean isNullOrBlank(java.lang.CharSequence r0) {
            if (r0 == 0) goto Lb
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r0)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isNullOrEmpty(java.lang.CharSequence r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.CharIterator iterator(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.text.StringsKt__StringsKt$iterator$1 r0 = new kotlin.text.StringsKt__StringsKt$iterator$1
            r0.<init>(r1)
            return r0
    }

    public static final int lastIndexOf(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, char r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r5 != 0) goto L13
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto Lc
            goto L13
        Lc:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.lastIndexOf(r3, r4)
            goto L1d
        L13:
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r0[r1] = r3
            int r2 = lastIndexOfAny(r2, r0, r4, r5)
        L1d:
            return r2
    }

    public static final int lastIndexOf(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull java.lang.String r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            if (r9 != 0) goto L19
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto L12
            goto L19
        L12:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.lastIndexOf(r7, r8)
            goto L23
        L19:
            r3 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            int r6 = indexOf$StringsKt__StringsKt(r0, r1, r2, r3, r4, r5)
        L23:
            return r6
    }

    public static /* synthetic */ int lastIndexOf$default(java.lang.CharSequence r0, char r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = getLastIndex(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = lastIndexOf(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int lastIndexOf$default(java.lang.CharSequence r0, java.lang.String r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = getLastIndex(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = lastIndexOf(r0, r1, r2, r3)
            return r0
    }

    public static final int lastIndexOfAny(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            kotlin.Pair r1 = findAnyOf$StringsKt__StringsKt(r1, r2, r3, r4, r0)
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r1.getFirst()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L1e
        L1d:
            r1 = -1
        L1e:
            return r1
    }

    public static final int lastIndexOfAny(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull char[] r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 1
            if (r9 != 0) goto L1f
            int r1 = r7.length
            if (r1 != r0) goto L1f
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L1f
            char r7 = kotlin.collections.ArraysKt.single(r7)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.lastIndexOf(r7, r8)
            return r6
        L1f:
            int r1 = getLastIndex(r6)
            int r8 = kotlin.ranges.RangesKt.coerceAtMost(r8, r1)
        L27:
            r1 = -1
            if (r1 >= r8) goto L46
            char r1 = r6.charAt(r8)
            int r2 = r7.length
            r3 = 0
            r4 = 0
        L31:
            if (r4 >= r2) goto L40
            char r5 = r7[r4]
            boolean r5 = kotlin.text.CharsKt__CharKt.equals(r5, r1, r9)
            if (r5 == 0) goto L3d
            r3 = 1
            goto L40
        L3d:
            int r4 = r4 + 1
            goto L31
        L40:
            if (r3 == 0) goto L43
            return r8
        L43:
            int r8 = r8 + (-1)
            goto L27
        L46:
            return r1
    }

    public static /* synthetic */ int lastIndexOfAny$default(java.lang.CharSequence r0, java.util.Collection r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = getLastIndex(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = lastIndexOfAny(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int lastIndexOfAny$default(java.lang.CharSequence r0, char[] r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = getLastIndex(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = lastIndexOfAny(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<java.lang.String> lineSequence(@org.jetbrains.annotations.NotNull java.lang.CharSequence r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "\n"
            java.lang.String r2 = "\r"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1, r2}
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r9
            kotlin.sequences.Sequence r9 = splitToSequence$default(r3, r4, r5, r6, r7, r8)
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> lines(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.sequences.Sequence r1 = lineSequence(r1)
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean matches(java.lang.CharSequence r1, kotlin.text.Regex r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r1 = r2.matches(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String orEmpty(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence padEnd(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, int r4, char r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 < 0) goto L3c
            int r0 = r3.length()
            if (r4 > r0) goto L17
            r4 = 0
            int r5 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r4, r5)
            return r3
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r3)
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
            r2 = 1
            int r3 = r3.length()
            int r4 = r4 - r3
            r1.<init>(r2, r4)
            kotlin.collections.IntIterator r3 = r1.iterator2()
        L2e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3b
            r3.nextInt()
            r0.append(r5)
            goto L2e
        L3b:
            return r0
        L3c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Desired length "
            java.lang.String r0 = " is less than zero."
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r4, r0)
            r3.<init>(r4)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String padEnd(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, char r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.CharSequence r1 = padEnd(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static /* synthetic */ java.lang.CharSequence padEnd$default(java.lang.CharSequence r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.CharSequence r0 = padEnd(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String padEnd$default(java.lang.String r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.String r0 = padEnd(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence padStart(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, int r5, char r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r5 < 0) goto L3c
            int r0 = r4.length()
            if (r5 > r0) goto L17
            r5 = 0
            int r6 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
            return r4
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
            r2 = 1
            int r3 = r4.length()
            int r5 = r5 - r3
            r1.<init>(r2, r5)
            kotlin.collections.IntIterator r5 = r1.iterator2()
        L2b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L38
            r5.nextInt()
            r0.append(r6)
            goto L2b
        L38:
            r0.append(r4)
            return r0
        L3c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Desired length "
            java.lang.String r0 = " is less than zero."
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r5, r0)
            r4.<init>(r5)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String padStart(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, char r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.CharSequence r1 = padStart(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static /* synthetic */ java.lang.CharSequence padStart$default(java.lang.CharSequence r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.CharSequence r0 = padStart(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String padStart$default(java.lang.String r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.String r0 = padStart(r0, r1, r2)
            return r0
    }

    private static final kotlin.sequences.Sequence<kotlin.ranges.IntRange> rangesDelimitedBy$StringsKt__StringsKt(java.lang.CharSequence r2, char[] r3, int r4, boolean r5, int r6) {
            requireNonNegativeLimit(r6)
            kotlin.text.DelimitedRangesSequence r0 = new kotlin.text.DelimitedRangesSequence
            kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1 r1 = new kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            r1.<init>(r3, r5)
            r0.<init>(r2, r4, r6, r1)
            return r0
    }

    private static final kotlin.sequences.Sequence<kotlin.ranges.IntRange> rangesDelimitedBy$StringsKt__StringsKt(java.lang.CharSequence r2, java.lang.String[] r3, int r4, boolean r5, int r6) {
            requireNonNegativeLimit(r6)
            java.util.List r3 = kotlin.collections.ArraysKt.asList(r3)
            kotlin.text.DelimitedRangesSequence r0 = new kotlin.text.DelimitedRangesSequence
            kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2 r1 = new kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            r1.<init>(r3, r5)
            r0.<init>(r2, r4, r6, r1)
            return r0
    }

    public static final boolean regionMatchesImpl(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, int r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6, int r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            if (r7 < 0) goto L39
            if (r5 < 0) goto L39
            int r1 = r4.length()
            int r1 = r1 - r8
            if (r5 > r1) goto L39
            int r1 = r6.length()
            int r1 = r1 - r8
            if (r7 <= r1) goto L1e
            goto L39
        L1e:
            r1 = 0
        L1f:
            if (r1 >= r8) goto L37
            int r2 = r5 + r1
            char r2 = r4.charAt(r2)
            int r3 = r7 + r1
            char r3 = r6.charAt(r3)
            boolean r2 = kotlin.text.CharsKt__CharKt.equals(r2, r3, r9)
            if (r2 != 0) goto L34
            return r0
        L34:
            int r1 = r1 + 1
            goto L1f
        L37:
            r4 = 1
            return r4
        L39:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence removePrefix(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            boolean r1 = startsWith$default(r3, r4, r0, r1, r2)
            if (r1 == 0) goto L20
            int r4 = r4.length()
            int r0 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            return r3
        L20:
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r0, r4)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String removePrefix(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            boolean r0 = startsWith$default(r3, r4, r0, r1, r2)
            if (r0 == 0) goto L21
            int r4 = r4.length()
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        L21:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence removeRange(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r6 < r5) goto L33
            r0 = 0
            if (r6 != r5) goto L13
            int r5 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r0, r5)
            return r4
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r4.length()
            int r3 = r6 - r5
            int r2 = r2 - r3
            r1.<init>(r2)
            r1.append(r4, r0, r5)
            java.lang.String r5 = "this.append(value, startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            int r0 = r4.length()
            r1.append(r4, r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            return r1
        L33:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End index ("
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ") is less than start index ("
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = ")."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence removeRange(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, @org.jetbrains.annotations.NotNull kotlin.ranges.IntRange r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Integer r0 = r3.getStart()
            int r0 = r0.intValue()
            r1 = 1
            int r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
            java.lang.CharSequence r2 = removeRange(r2, r0, r3)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String removeRange(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.CharSequence r1 = removeRange(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String removeRange(java.lang.String r1, kotlin.ranges.IntRange r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.CharSequence r1 = removeRange(r1, r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence removeSuffix(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            boolean r1 = endsWith$default(r3, r4, r0, r1, r2)
            if (r1 == 0) goto L22
            int r1 = r3.length()
            int r4 = r4.length()
            int r1 = r1 - r4
            java.lang.CharSequence r3 = r3.subSequence(r0, r1)
            return r3
        L22:
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r0, r4)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String removeSuffix(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            boolean r1 = endsWith$default(r3, r4, r0, r1, r2)
            if (r1 == 0) goto L27
            int r1 = r3.length()
            int r4 = r4.length()
            int r1 = r1 - r4
            java.lang.String r3 = r3.substring(r0, r1)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        L27:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence removeSurrounding(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.CharSequence r1 = removeSurrounding(r1, r2, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence removeSurrounding(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r4.length()
            int r1 = r5.length()
            int r2 = r6.length()
            int r2 = r2 + r1
            r1 = 0
            if (r0 < r2) goto L40
            r0 = 2
            r2 = 0
            boolean r3 = startsWith$default(r4, r5, r1, r0, r2)
            if (r3 == 0) goto L40
            boolean r0 = endsWith$default(r4, r6, r1, r0, r2)
            if (r0 == 0) goto L40
            int r5 = r5.length()
            int r0 = r4.length()
            int r6 = r6.length()
            int r0 = r0 - r6
            java.lang.CharSequence r4 = r4.subSequence(r5, r0)
            return r4
        L40:
            int r5 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r1, r5)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String removeSurrounding(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r1 = removeSurrounding(r1, r2, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String removeSurrounding(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r4.length()
            int r1 = r5.length()
            int r2 = r6.length()
            int r2 = r2 + r1
            if (r0 < r2) goto L45
            r0 = 0
            r1 = 2
            r2 = 0
            boolean r3 = startsWith$default(r4, r5, r0, r1, r2)
            if (r3 == 0) goto L45
            boolean r0 = endsWith$default(r4, r6, r0, r1, r2)
            if (r0 == 0) goto L45
            int r5 = r5.length()
            int r0 = r4.length()
            int r6 = r6.length()
            int r0 = r0 - r6
            java.lang.String r4 = r4.substring(r5, r0)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
        L45:
            return r4
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String replace(java.lang.CharSequence r1, kotlin.text.Regex r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = r2.replace(r1, r3)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String replace(java.lang.CharSequence r1, kotlin.text.Regex r2, kotlin.jvm.functions.Function1<? super kotlin.text.MatchResult, ? extends java.lang.CharSequence> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = r2.replace(r1, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String replaceAfter(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L2b
        L1d:
            int r8 = r8 + 1
            int r10 = r7.length()
            java.lang.CharSequence r7 = replaceRange(r7, r8, r10, r9)
            java.lang.String r10 = r7.toString()
        L2b:
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String replaceAfter(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r0 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r1 = -1
            if (r0 != r1) goto L22
            goto L33
        L22:
            int r8 = r8.length()
            int r8 = r8 + r0
            int r10 = r7.length()
            java.lang.CharSequence r7 = replaceRange(r7, r8, r10, r9)
            java.lang.String r10 = r7.toString()
        L33:
            return r10
    }

    public static /* synthetic */ java.lang.String replaceAfter$default(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = replaceAfter(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String replaceAfter$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = replaceAfter(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String replaceAfterLast(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = lastIndexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L2b
        L1d:
            int r8 = r8 + 1
            int r10 = r7.length()
            java.lang.CharSequence r7 = replaceRange(r7, r8, r10, r9)
            java.lang.String r10 = r7.toString()
        L2b:
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String replaceAfterLast(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r0 = lastIndexOf$default(r1, r2, r3, r4, r5, r6)
            r1 = -1
            if (r0 != r1) goto L22
            goto L33
        L22:
            int r8 = r8.length()
            int r8 = r8 + r0
            int r10 = r7.length()
            java.lang.CharSequence r7 = replaceRange(r7, r8, r10, r9)
            java.lang.String r10 = r7.toString()
        L33:
            return r10
    }

    public static /* synthetic */ java.lang.String replaceAfterLast$default(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = replaceAfterLast(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String replaceAfterLast$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = replaceAfterLast(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String replaceBefore(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L26
        L1d:
            r10 = 0
            java.lang.CharSequence r7 = replaceRange(r7, r10, r8, r9)
            java.lang.String r10 = r7.toString()
        L26:
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String replaceBefore(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L22
            goto L2b
        L22:
            r10 = 0
            java.lang.CharSequence r7 = replaceRange(r7, r10, r8, r9)
            java.lang.String r10 = r7.toString()
        L2b:
            return r10
    }

    public static /* synthetic */ java.lang.String replaceBefore$default(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = replaceBefore(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String replaceBefore$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = replaceBefore(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String replaceBeforeLast(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = lastIndexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L26
        L1d:
            r10 = 0
            java.lang.CharSequence r7 = replaceRange(r7, r10, r8, r9)
            java.lang.String r10 = r7.toString()
        L26:
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String replaceBeforeLast(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = lastIndexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L22
            goto L2b
        L22:
            r10 = 0
            java.lang.CharSequence r7 = replaceRange(r7, r10, r8, r9)
            java.lang.String r10 = r7.toString()
        L2b:
            return r10
    }

    public static /* synthetic */ java.lang.String replaceBeforeLast$default(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = replaceBeforeLast(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String replaceBeforeLast$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = replaceBeforeLast(r0, r1, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String replaceFirst(java.lang.CharSequence r1, kotlin.text.Regex r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = r2.replaceFirst(r1, r3)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "replaceFirstCharWithChar")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    private static final java.lang.String replaceFirstCharWithChar(java.lang.String r3, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Character> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L43
            char r0 = r3.charAt(r2)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r4 = r4.invoke(r0)
            java.lang.Character r4 = (java.lang.Character) r4
            char r4 = r4.charValue()
            java.lang.String r3 = r3.substring(r1)
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L43:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "replaceFirstCharWithCharSequence")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    private static final java.lang.String replaceFirstCharWithCharSequence(java.lang.String r3, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.lang.CharSequence> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r2 = r3.charAt(r2)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r4 = r4.invoke(r2)
            r0.append(r4)
            java.lang.String r3 = r3.substring(r1)
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L3d:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence replaceRange(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, int r3, int r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r4 < r3) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r0.append(r2, r1, r3)
            java.lang.String r3 = "this.append(value, startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r0.append(r5)
            int r5 = r2.length()
            r0.append(r2, r4, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            return r0
        L29:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "End index ("
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = ") is less than start index ("
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = ")."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence replaceRange(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, @org.jetbrains.annotations.NotNull kotlin.ranges.IntRange r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Integer r0 = r3.getStart()
            int r0 = r0.intValue()
            r1 = 1
            int r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
            java.lang.CharSequence r2 = replaceRange(r2, r0, r3, r4)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String replaceRange(java.lang.String r1, int r2, int r3, java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.CharSequence r1 = replaceRange(r1, r2, r3, r4)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String replaceRange(java.lang.String r1, kotlin.ranges.IntRange r2, java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.CharSequence r1 = replaceRange(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static final void requireNonNegativeLimit(int r1) {
            if (r1 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.String r0 = "Limit must be non-negative, but was "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.List<java.lang.String> split(java.lang.CharSequence r1, kotlin.text.Regex r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r1 = r2.split(r1, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> split(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull char[] r4, boolean r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1a
            char r4 = r4[r1]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.util.List r3 = split$StringsKt__StringsKt(r3, r4, r5, r6)
            return r3
        L1a:
            kotlin.sequences.Sequence r4 = rangesDelimitedBy$StringsKt__StringsKt(r3, r4, r1, r5, r6)
            java.lang.Iterable r4 = kotlin.sequences.SequencesKt.asIterable(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L43
            java.lang.Object r6 = r4.next()
            kotlin.ranges.IntRange r6 = (kotlin.ranges.IntRange) r6
            java.lang.String r6 = substring(r3, r6)
            r5.add(r6)
            goto L2f
        L43:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> split(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull java.lang.String[] r5, boolean r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L20
            r0 = r5[r1]
            int r3 = r0.length()
            if (r3 != 0) goto L18
            goto L19
        L18:
            r2 = 0
        L19:
            if (r2 != 0) goto L20
            java.util.List r4 = split$StringsKt__StringsKt(r4, r0, r6, r7)
            return r4
        L20:
            kotlin.sequences.Sequence r5 = rangesDelimitedBy$StringsKt__StringsKt(r4, r5, r1, r6, r7)
            java.lang.Iterable r5 = kotlin.sequences.SequencesKt.asIterable(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L35:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L49
            java.lang.Object r7 = r5.next()
            kotlin.ranges.IntRange r7 = (kotlin.ranges.IntRange) r7
            java.lang.String r7 = substring(r4, r7)
            r6.add(r7)
            goto L35
        L49:
            return r6
    }

    private static final java.util.List<java.lang.String> split$StringsKt__StringsKt(java.lang.CharSequence r7, java.lang.String r8, boolean r9, int r10) {
            requireNonNegativeLimit(r10)
            r0 = 0
            int r1 = indexOf(r7, r8, r0, r9)
            r2 = -1
            if (r1 == r2) goto L51
            r3 = 1
            if (r10 != r3) goto Lf
            goto L51
        Lf:
            if (r10 <= 0) goto L13
            r4 = 1
            goto L14
        L13:
            r4 = 0
        L14:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            if (r4 == 0) goto L1e
            int r6 = kotlin.ranges.RangesKt.coerceAtMost(r10, r6)
        L1e:
            r5.<init>(r6)
        L21:
            java.lang.CharSequence r0 = r7.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            r5.add(r0)
            int r0 = r8.length()
            int r0 = r0 + r1
            if (r4 == 0) goto L3b
            int r1 = r5.size()
            int r6 = r10 + (-1)
            if (r1 == r6) goto L41
        L3b:
            int r1 = indexOf(r7, r8, r0, r9)
            if (r1 != r2) goto L21
        L41:
            int r8 = r7.length()
            java.lang.CharSequence r7 = r7.subSequence(r0, r8)
            java.lang.String r7 = r7.toString()
            r5.add(r7)
            return r5
        L51:
            java.lang.String r7 = r7.toString()
            java.util.List r7 = kotlin.collections.CollectionsKt.listOf(r7)
            return r7
    }

    public static /* synthetic */ java.util.List split$default(java.lang.CharSequence r1, char[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            java.util.List r1 = split(r1, r2, r3, r4)
            return r1
    }

    public static /* synthetic */ java.util.List split$default(java.lang.CharSequence r1, java.lang.String[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            java.util.List r1 = split(r1, r2, r3, r4)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final kotlin.sequences.Sequence<java.lang.String> splitToSequence(java.lang.CharSequence r1, kotlin.text.Regex r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.sequences.Sequence r1 = r2.splitToSequence(r1, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<java.lang.String> splitToSequence(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull char[] r2, boolean r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            kotlin.sequences.Sequence r2 = rangesDelimitedBy$StringsKt__StringsKt(r1, r2, r0, r3, r4)
            kotlin.text.StringsKt__StringsKt$splitToSequence$2 r3 = new kotlin.text.StringsKt__StringsKt$splitToSequence$2
            r3.<init>(r1)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.map(r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<java.lang.String> splitToSequence(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.lang.String[] r2, boolean r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            kotlin.sequences.Sequence r2 = rangesDelimitedBy$StringsKt__StringsKt(r1, r2, r0, r3, r4)
            kotlin.text.StringsKt__StringsKt$splitToSequence$1 r3 = new kotlin.text.StringsKt__StringsKt$splitToSequence$1
            r3.<init>(r1)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.map(r2, r3)
            return r1
    }

    public static /* synthetic */ kotlin.sequences.Sequence splitToSequence$default(java.lang.CharSequence r1, char[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            kotlin.sequences.Sequence r1 = splitToSequence(r1, r2, r3, r4)
            return r1
    }

    public static /* synthetic */ kotlin.sequences.Sequence splitToSequence$default(java.lang.CharSequence r1, java.lang.String[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            kotlin.sequences.Sequence r1 = splitToSequence(r1, r2, r3, r4)
            return r1
    }

    public static final boolean startsWith(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, char r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length()
            r1 = 0
            if (r0 <= 0) goto L17
            char r2 = r2.charAt(r1)
            boolean r2 = kotlin.text.CharsKt__CharKt.equals(r2, r3, r4)
            if (r2 == 0) goto L17
            r1 = 1
        L17:
            return r1
    }

    public static final boolean startsWith(@org.jetbrains.annotations.NotNull java.lang.CharSequence r7, @org.jetbrains.annotations.NotNull java.lang.CharSequence r8, int r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            if (r10 != 0) goto L23
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L23
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L23
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            r4 = 0
            r5 = 4
            r6 = 0
            r3 = r9
            boolean r7 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r1, r2, r3, r4, r5, r6)
            return r7
        L23:
            r3 = 0
            int r4 = r8.length()
            r0 = r7
            r1 = r9
            r2 = r8
            r5 = r10
            boolean r7 = regionMatchesImpl(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public static final boolean startsWith(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull java.lang.CharSequence r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            if (r8 != 0) goto L20
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L20
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L20
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            r0 = 2
            r1 = 0
            boolean r6 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r6, r7, r8, r0, r1)
            return r6
        L20:
            r1 = 0
            r3 = 0
            int r4 = r7.length()
            r0 = r6
            r2 = r7
            r5 = r8
            boolean r6 = regionMatchesImpl(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.CharSequence r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = startsWith(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.CharSequence r0, java.lang.CharSequence r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            boolean r0 = startsWith(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = startsWith(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence subSequence(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull kotlin.ranges.IntRange r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Integer r0 = r2.getStart()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.getEndInclusive()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @kotlin.ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @kotlin.internal.InlineOnly
    private static final java.lang.CharSequence subSequence(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String substring(java.lang.CharSequence r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String substring(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull kotlin.ranges.IntRange r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Integer r0 = r2.getStart()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.getEndInclusive()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String substring(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.ranges.IntRange r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Integer r0 = r2.getStart()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.getEndInclusive()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r0, r2)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String substringAfter(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L18
            goto L28
        L18:
            int r8 = r8 + 1
            int r9 = r7.length()
            java.lang.String r9 = r7.substring(r8, r9)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L28:
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String substringAfter(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r0 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r1 = -1
            if (r0 != r1) goto L1d
            goto L30
        L1d:
            int r8 = r8.length()
            int r8 = r8 + r0
            int r9 = r7.length()
            java.lang.String r9 = r7.substring(r8, r9)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L30:
            return r9
    }

    public static /* synthetic */ java.lang.String substringAfter$default(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringAfter(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String substringAfter$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringAfter(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String substringAfterLast(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = lastIndexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L18
            goto L28
        L18:
            int r8 = r8 + 1
            int r9 = r7.length()
            java.lang.String r9 = r7.substring(r8, r9)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L28:
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String substringAfterLast(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r0 = lastIndexOf$default(r1, r2, r3, r4, r5, r6)
            r1 = -1
            if (r0 != r1) goto L1d
            goto L30
        L1d:
            int r8 = r8.length()
            int r8 = r8 + r0
            int r9 = r7.length()
            java.lang.String r9 = r7.substring(r8, r9)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L30:
            return r9
    }

    public static /* synthetic */ java.lang.String substringAfterLast$default(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringAfterLast(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String substringAfterLast$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringAfterLast(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String substringBefore(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L18
            goto L23
        L18:
            r9 = 0
            java.lang.String r9 = r7.substring(r9, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L23:
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String substringBefore(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L28
        L1d:
            r9 = 0
            java.lang.String r9 = r7.substring(r9, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L28:
            return r9
    }

    public static /* synthetic */ java.lang.String substringBefore$default(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringBefore(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String substringBefore$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringBefore(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String substringBeforeLast(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = lastIndexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L18
            goto L23
        L18:
            r9 = 0
            java.lang.String r9 = r7.substring(r9, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L23:
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String substringBeforeLast(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = lastIndexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L28
        L1d:
            r9 = 0
            java.lang.String r9 = r7.substring(r9, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L28:
            return r9
    }

    public static /* synthetic */ java.lang.String substringBeforeLast$default(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringBeforeLast(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String substringBeforeLast$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringBeforeLast(r0, r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final boolean toBooleanStrict(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "true"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L10
            r2 = 1
            goto L19
        L10:
            java.lang.String r0 = "false"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L1a
            r2 = 0
        L19:
            return r2
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The string doesn't represent a boolean value: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Boolean toBooleanStrictOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "true"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L11
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L1d
        L11:
            java.lang.String r0 = "false"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r1 == 0) goto L1c
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.CharSequence trim(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        Ld:
            if (r2 > r0) goto L2b
            if (r3 != 0) goto L13
            r4 = r2
            goto L14
        L13:
            r4 = r0
        L14:
            char r4 = r5.charAt(r4)
            boolean r4 = kotlin.text.CharsKt__CharJVMKt.isWhitespace(r4)
            if (r3 != 0) goto L25
            if (r4 != 0) goto L22
            r3 = 1
            goto Ld
        L22:
            int r2 = r2 + 1
            goto Ld
        L25:
            if (r4 != 0) goto L28
            goto L2b
        L28:
            int r0 = r0 + (-1)
            goto Ld
        L2b:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence trim(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r4.length()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = 0
        L12:
            if (r1 > r0) goto L32
            if (r2 != 0) goto L18
            r3 = r1
            goto L19
        L18:
            r3 = r0
        L19:
            java.lang.Object r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r3, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r2 != 0) goto L2c
            if (r3 != 0) goto L29
            r2 = 1
            goto L12
        L29:
            int r1 = r1 + 1
            goto L12
        L2c:
            if (r3 != 0) goto L2f
            goto L32
        L2f:
            int r0 = r0 + (-1)
            goto L12
        L32:
            int r0 = r0 + 1
            java.lang.CharSequence r4 = r4.subSequence(r1, r0)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence trim(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull char... r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L12:
            if (r2 > r0) goto L30
            if (r3 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r0
        L19:
            char r4 = r5.charAt(r4)
            boolean r4 = kotlin.collections.ArraysKt.contains(r6, r4)
            if (r3 != 0) goto L2a
            if (r4 != 0) goto L27
            r3 = 1
            goto L12
        L27:
            int r2 = r2 + 1
            goto L12
        L2a:
            if (r4 != 0) goto L2d
            goto L30
        L2d:
            int r0 = r0 + (-1)
            goto L12
        L30:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String trim(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.CharSequence r1 = trim(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String trim(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L12:
            if (r2 > r0) goto L3a
            if (r3 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r0
        L19:
            char r4 = r5.charAt(r4)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r3 != 0) goto L34
            if (r4 != 0) goto L31
            r3 = 1
            goto L12
        L31:
            int r2 = r2 + 1
            goto L12
        L34:
            if (r4 != 0) goto L37
            goto L3a
        L37:
            int r0 = r0 + (-1)
            goto L12
        L3a:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String trim(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull char... r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L12:
            if (r2 > r0) goto L30
            if (r3 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r0
        L19:
            char r4 = r5.charAt(r4)
            boolean r4 = kotlin.collections.ArraysKt.contains(r6, r4)
            if (r3 != 0) goto L2a
            if (r4 != 0) goto L27
            r3 = 1
            goto L12
        L27:
            int r2 = r2 + 1
            goto L12
        L2a:
            if (r4 != 0) goto L2d
            goto L30
        L2d:
            int r0 = r0 + (-1)
            goto L12
        L30:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence trimEnd(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L26
        Ld:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = kotlin.text.CharsKt__CharJVMKt.isWhitespace(r2)
            if (r2 != 0) goto L21
            r1 = 0
            int r0 = r0 + 1
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            goto L28
        L21:
            if (r1 >= 0) goto L24
            goto L26
        L24:
            r0 = r1
            goto Ld
        L26:
            java.lang.String r3 = ""
        L28:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence trimEnd(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L2d
        L12:
            int r1 = r0 + (-1)
            java.lang.Object r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L28
            r4 = 0
            int r0 = r0 + 1
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            return r3
        L28:
            if (r1 >= 0) goto L2b
            goto L2d
        L2b:
            r0 = r1
            goto L12
        L2d:
            java.lang.String r3 = ""
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence trimEnd(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull char... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L2b
        L12:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = kotlin.collections.ArraysKt.contains(r4, r2)
            if (r2 != 0) goto L26
            r4 = 0
            int r0 = r0 + 1
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L2d
        L26:
            if (r1 >= 0) goto L29
            goto L2b
        L29:
            r0 = r1
            goto L12
        L2b:
            java.lang.String r3 = ""
        L2d:
            return r3
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String trimEnd(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.CharSequence r1 = trimEnd(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String trimEnd(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L35
        L12:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L30
            r4 = 0
            int r0 = r0 + 1
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L37
        L30:
            if (r1 >= 0) goto L33
            goto L35
        L33:
            r0 = r1
            goto L12
        L35:
            java.lang.String r3 = ""
        L37:
            java.lang.String r3 = r3.toString()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String trimEnd(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull char... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L2b
        L12:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = kotlin.collections.ArraysKt.contains(r4, r2)
            if (r2 != 0) goto L26
            r4 = 0
            int r0 = r0 + 1
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L2d
        L26:
            if (r1 >= 0) goto L29
            goto L2b
        L29:
            r0 = r1
            goto L12
        L2b:
            java.lang.String r3 = ""
        L2d:
            java.lang.String r3 = r3.toString()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence trimStart(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length()
            r1 = 0
        La:
            if (r1 >= r0) goto L22
            char r2 = r3.charAt(r1)
            boolean r2 = kotlin.text.CharsKt__CharJVMKt.isWhitespace(r2)
            if (r2 != 0) goto L1f
            int r0 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            goto L24
        L1f:
            int r1 = r1 + 1
            goto La
        L22:
            java.lang.String r3 = ""
        L24:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence trimStart(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            java.lang.String r1 = "predicate"
            int r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r4, r1)
            r1 = 0
        L9:
            if (r1 >= r0) goto L23
            java.lang.Object r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L20
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            return r3
        L20:
            int r1 = r1 + 1
            goto L9
        L23:
            java.lang.String r3 = ""
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence trimStart(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull char... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L27
            char r2 = r3.charAt(r1)
            boolean r2 = kotlin.collections.ArraysKt.contains(r4, r2)
            if (r2 != 0) goto L24
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            goto L29
        L24:
            int r1 = r1 + 1
            goto Lf
        L27:
            java.lang.String r3 = ""
        L29:
            return r3
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String trimStart(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.CharSequence r1 = trimStart(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String trimStart(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L31
            char r2 = r3.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L2e
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            goto L33
        L2e:
            int r1 = r1 + 1
            goto Lf
        L31:
            java.lang.String r3 = ""
        L33:
            java.lang.String r3 = r3.toString()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String trimStart(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull char... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L27
            char r2 = r3.charAt(r1)
            boolean r2 = kotlin.collections.ArraysKt.contains(r4, r2)
            if (r2 != 0) goto L24
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            goto L29
        L24:
            int r1 = r1 + 1
            goto Lf
        L27:
            java.lang.String r3 = ""
        L29:
            java.lang.String r3 = r3.toString()
            return r3
    }
}
