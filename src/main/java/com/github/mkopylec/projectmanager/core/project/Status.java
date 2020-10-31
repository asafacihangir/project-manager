package com.github.mkopylec.projectmanager.core.project;

import static com.github.mkopylec.projectmanager.api.exception.InvalidEntityException.require;
import static com.github.mkopylec.projectmanager.core.common.Utilities.isEmpty;
import static com.github.mkopylec.projectmanager.core.common.Utilities.isValueOfEnum;
import static com.github.mkopylec.projectmanager.core.project.ProjectViolation.INVALID_STATUS;

public enum Status {

    TO_DO,
    IN_PROGRESS,
    DONE;

    static Status from(String value) {
        if (isEmpty(value)) {
            return null;
        }
        require(isValueOfEnum(value, Status.class), INVALID_STATUS);
        return valueOf(value);
    }
}
