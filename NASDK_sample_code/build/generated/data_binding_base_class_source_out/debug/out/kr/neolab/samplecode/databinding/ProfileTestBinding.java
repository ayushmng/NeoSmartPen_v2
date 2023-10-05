// Generated by view binder compiler. Do not edit!
package kr.neolab.samplecode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.neolab.samplecode.R;

public final class ProfileTestBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonExe;

  @NonNull
  public final EditText profileKeyEdit;

  @NonNull
  public final LinearLayout profileKeyLayout;

  @NonNull
  public final EditText profileNameEdit;

  @NonNull
  public final LinearLayout profileNameLayout;

  @NonNull
  public final EditText profilePassEdit;

  @NonNull
  public final LinearLayout profilePassLayout;

  @NonNull
  public final EditText profileValueEdit;

  @NonNull
  public final LinearLayout profileValueLayout;

  @NonNull
  public final TextView resultText;

  @NonNull
  public final RadioButton selectRadio;

  private ProfileTestBinding(@NonNull LinearLayout rootView, @NonNull Button buttonExe,
      @NonNull EditText profileKeyEdit, @NonNull LinearLayout profileKeyLayout,
      @NonNull EditText profileNameEdit, @NonNull LinearLayout profileNameLayout,
      @NonNull EditText profilePassEdit, @NonNull LinearLayout profilePassLayout,
      @NonNull EditText profileValueEdit, @NonNull LinearLayout profileValueLayout,
      @NonNull TextView resultText, @NonNull RadioButton selectRadio) {
    this.rootView = rootView;
    this.buttonExe = buttonExe;
    this.profileKeyEdit = profileKeyEdit;
    this.profileKeyLayout = profileKeyLayout;
    this.profileNameEdit = profileNameEdit;
    this.profileNameLayout = profileNameLayout;
    this.profilePassEdit = profilePassEdit;
    this.profilePassLayout = profilePassLayout;
    this.profileValueEdit = profileValueEdit;
    this.profileValueLayout = profileValueLayout;
    this.resultText = resultText;
    this.selectRadio = selectRadio;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProfileTestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProfileTestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.profile_test, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProfileTestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_exe;
      Button buttonExe = rootView.findViewById(id);
      if (buttonExe == null) {
        break missingId;
      }

      id = R.id.profile_key_edit;
      EditText profileKeyEdit = rootView.findViewById(id);
      if (profileKeyEdit == null) {
        break missingId;
      }

      id = R.id.profile_key_layout;
      LinearLayout profileKeyLayout = rootView.findViewById(id);
      if (profileKeyLayout == null) {
        break missingId;
      }

      id = R.id.profile_name_edit;
      EditText profileNameEdit = rootView.findViewById(id);
      if (profileNameEdit == null) {
        break missingId;
      }

      id = R.id.profile_name_layout;
      LinearLayout profileNameLayout = rootView.findViewById(id);
      if (profileNameLayout == null) {
        break missingId;
      }

      id = R.id.profile_pass_edit;
      EditText profilePassEdit = rootView.findViewById(id);
      if (profilePassEdit == null) {
        break missingId;
      }

      id = R.id.profile_pass_layout;
      LinearLayout profilePassLayout = rootView.findViewById(id);
      if (profilePassLayout == null) {
        break missingId;
      }

      id = R.id.profile_value_edit;
      EditText profileValueEdit = rootView.findViewById(id);
      if (profileValueEdit == null) {
        break missingId;
      }

      id = R.id.profile_value_layout;
      LinearLayout profileValueLayout = rootView.findViewById(id);
      if (profileValueLayout == null) {
        break missingId;
      }

      id = R.id.result_text;
      TextView resultText = rootView.findViewById(id);
      if (resultText == null) {
        break missingId;
      }

      id = R.id.select_radio;
      RadioButton selectRadio = rootView.findViewById(id);
      if (selectRadio == null) {
        break missingId;
      }

      return new ProfileTestBinding((LinearLayout) rootView, buttonExe, profileKeyEdit,
          profileKeyLayout, profileNameEdit, profileNameLayout, profilePassEdit, profilePassLayout,
          profileValueEdit, profileValueLayout, resultText, selectRadio);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
