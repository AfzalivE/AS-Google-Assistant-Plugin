package com.google.assistant.plugin.shortcuts.ui.common;

import com.google.assistant.plugin.shortcuts.models.HelpInfo;
import com.intellij.ide.BrowserUtil;
import com.intellij.ui.ContextHelpLabel;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NumberedLabel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/common/NumberedLabel;", "Ljavax/swing/JPanel;", "number", "", "title", "", "helpInfo", "Lcom/google/assistant/plugin/shortcuts/models/HelpInfo;", "(ILjava/lang/String;Lcom/google/assistant/plugin/shortcuts/models/HelpInfo;)V", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/common/NumberedLabel.class */
public final class NumberedLabel extends JPanel {
    public NumberedLabel(int number, @NotNull String title, @NotNull final HelpInfo helpInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(helpInfo, "helpInfo");
        setLayout((LayoutManager) new BoxLayout((Container) this, 2));
        CircleLabel numberLabel = new CircleLabel(8, String.valueOf(number));
        JLabel textLabel = new JLabel();
        textLabel.setText("  " + title);
        Font font = textLabel.getFont();
        Intrinsics.checkNotNullExpressionValue(font, "textLabel.font");
        String family = font.getFamily();
        Font font2 = textLabel.getFont();
        Intrinsics.checkNotNullExpressionValue(font2, "textLabel.font");
        textLabel.setFont(new Font(family, 1, font2.getSize()));
        add((Component) numberLabel);
        add((Component) textLabel);
        ContextHelpLabel helpBalloon = ContextHelpLabel.createWithLink((String) null, helpInfo.getText(), helpInfo.getLinkText(), new Runnable() { // from class: com.google.assistant.plugin.shortcuts.ui.common.NumberedLabel$helpBalloon$1
            @Override // java.lang.Runnable
            public final void run() {
                BrowserUtil.browse(helpInfo.getLinkUrl());
            }
        });
        Intrinsics.checkNotNullExpressionValue(helpBalloon, "ContextHelpLabel.createW…lpInfo.linkUrl)\n        }");
        helpBalloon.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
        add((Component) helpBalloon);
        setAlignmentX(0.0f);
        setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
    }
}
