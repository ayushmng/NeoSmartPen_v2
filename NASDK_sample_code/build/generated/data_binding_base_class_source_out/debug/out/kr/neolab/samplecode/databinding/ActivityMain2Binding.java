// Generated by view binder compiler. Do not edit!
package kr.neolab.samplecode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.neolab.samplecode.R;

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout activityMain2;

  @NonNull
  public final Button button;

  private ActivityMain2Binding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout activityMain2, @NonNull Button button) {
    this.rootView = rootView;
    this.activityMain2 = activityMain2;
    this.button = button;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout activityMain2 = (RelativeLayout) rootView;

      id = R.id.button;
      Button button = rootView.findViewById(id);
      if (button == null) {
        break missingId;
      }

      return new ActivityMain2Binding((RelativeLayout) rootView, activityMain2, button);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}