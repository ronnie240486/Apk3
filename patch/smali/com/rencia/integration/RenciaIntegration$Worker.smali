.class public final Lcom/rencia/integration/RenciaIntegration$Worker;
.super Ljava/lang/Object;
.source "RenciaIntegration.java"

.implements Ljava/lang/Runnable;

.field private final context:Landroid/content/Context;

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lcom/rencia/integration/RenciaIntegration$Worker;->context:Landroid/content/Context;
    return-void
.end method

.method public run()V
    .locals 4
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/rencia/integration/RenciaIntegration$Worker;->context:Landroid/content/Context;
    invoke-static {v0}, Lcom/rencia/integration/RenciaIntegration;->sync(Landroid/content/Context;)V
    invoke-static {v0}, Lcom/rencia/integration/RenciaIntegration;->checkUpdate(Landroid/content/Context;)V
    invoke-static {v0}, Lcom/rencia/integration/RenciaIntegration;->pollRemoteCommands(Landroid/content/Context;)V
    const-wide/32 v2, 0xea60
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    goto :goto_0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    :catch_0
    return-void
.end method
