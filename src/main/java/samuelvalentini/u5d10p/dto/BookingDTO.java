package samuelvalentini.u5d10p.dto;

import jakarta.validation.constraints.NotNull;

public record BookingDTO(
        @NotNull(message = "Trip id is required")
        Long tripId,

        @NotNull(message = "Employee id is required")
        Long employeeId,

        String notesPreferences
) {

}
