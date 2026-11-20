package com.college.website.controller;

import com.college.website.dto.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/accessibility")
@CrossOrigin(origins = "*")
@Tag(name = "Accessibility", description = "Public accessibility statement API")
public class AccessibilityController {

    @GetMapping("/statement")
    @Operation(summary = "Get the college accessibility statement")
    public ResponseEntity<ApiResponse<Map<String, Object>>> getAccessibilityStatement() {
        Map<String, Object> statement = Map.of(
            "collegeName", "Sri Vidyodaya Composite Pre-University College",
            "title", "Accessibility Statement",
            "description", "Sri Vidyodaya Composite Pre-University College is dedicated to ensuring digital accessibility for people with disabilities. We continually improve the user experience for all visitors and aim to follow WCAG 2.1 Level AA guidelines.",
            "sections", List.of(
                Map.of(
                    "heading", "Keyboard Navigation & Screen Readers",
                    "content", "Navigation, course browsing and admission enquiry forms are designed to support keyboard navigation and assistive screen readers."
                ),
                Map.of(
                    "heading", "Visual Accessibility",
                    "content", "We aim to provide readable text, appropriate colour contrast, meaningful image descriptions and responsive layouts."
                ),
                Map.of(
                    "heading", "Continuous Improvement",
                    "content", "We regularly review the website and work to improve accessibility for all visitors."
                ),
                Map.of(
                    "heading", "Accessibility Feedback",
                    "content", "Visitors can contact the college to report accessibility issues or request assistance."
                )
            ),
            "features", List.of(
                "Keyboard-friendly navigation",
                "Screen reader support",
                "Responsive website design",
                "Readable text and content",
                "Meaningful image alternative text",
                "Accessible admission enquiry forms"
            ),
            "standard", "WCAG 2.1 Level AA",
            "contactMessage", "Please contact the college if you experience any difficulty accessing website information."
        );

        return ResponseEntity.ok(
            ApiResponse.ok("Accessibility statement retrieved successfully", statement)
        );
    }
}
