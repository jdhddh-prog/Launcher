package com.jdhddh.launcher.ui.theme

import androidx.compose.ui.graphics.Color

/**
 * Cyberpunk Color Palette
 * A dark, neon-infused color scheme inspired by cyberpunk aesthetics
 */

// ==================== Background Colors ====================
val CyberpunkBackgroundDark = Color(0xFF0A0E27)      // Deep dark blue-black
val CyberpunkBackgroundDarker = Color(0xFF050812)    // Almost pure black
val CyberpunkBackgroundCard = Color(0xFF1A1F3A)      // Slightly lighter card background
val CyberpunkBackgroundSurface = Color(0xFF252D4A)   // Surface background for elevated components
val CyberpunkBackgroundOverlay = Color(0xFF0A0E27).copy(alpha = 0.8f)  // Overlay with transparency

// ==================== Neon Colors ====================
val CyberpunkNeonCyan = Color(0xFF00D9FF)            // Bright cyan/electric blue
val CyberpunkNeonMagenta = Color(0xFFFF006E)         // Hot magenta/pink
val CyberpunkNeonPurple = Color(0xFFB400FF)          // Vibrant purple
val CyberpunkNeonLime = Color(0xFF39FF14)            // Electric lime green
val CyberpunkNeonOrange = Color(0xFFFF6600)          // Neon orange
val CyberpunkNeonPink = Color(0xFFFF10F0)            // Bright pink
val CyberpunkNeonBlue = Color(0xFF0080FF)            // Neon blue
val CyberpunkNeonYellow = Color(0xFFFFFF00)          // Electric yellow

// ==================== Primary Accent Colors ====================
val CyberpunkPrimaryNeon = Color(0xFF00D9FF)         // Primary: Cyan
val CyberpunkSecondaryNeon = Color(0xFFFF006E)       // Secondary: Magenta
val CyberpunkTertiaryNeon = Color(0xFFB400FF)        // Tertiary: Purple

// ==================== Text Colors ====================
val CyberpunkTextPrimary = Color(0xFFFFFFFF)         // Pure white for main text
val CyberpunkTextSecondary = Color(0xFFB0B9C3)       // Light gray for secondary text
val CyberpunkTextTertiary = Color(0xFF7A8493)        // Medium gray for tertiary text
val CyberpunkTextMuted = Color(0xFF505865)           // Muted dark gray
val CyberpunkTextNeonCyan = Color(0xFF00D9FF)        // Neon cyan text
val CyberpunkTextNeonMagenta = Color(0xFFFF006E)     // Neon magenta text
val CyberpunkTextHint = Color(0xFF3E4556)            // Very dark gray for hints

// ==================== Status Colors ====================
// Success
val CyberpunkStatusSuccess = Color(0xFF00D966)       // Neon green
val CyberpunkStatusSuccessLight = Color(0xFF39FF14)  // Bright lime
val CyberpunkStatusSuccessDark = Color(0xFF00AA55)   // Darker neon green

// Error
val CyberpunkStatusError = Color(0xFFFF0055)         // Bright red-pink
val CyberpunkStatusErrorLight = Color(0xFFFF3366)    // Lighter red-pink
val CyberpunkStatusErrorDark = Color(0xFFCC0044)     // Darker red

// Warning
val CyberpunkStatusWarning = Color(0xFFFFAA00)       // Neon orange-yellow
val CyberpunkStatusWarningLight = Color(0xFFFFBB33)  // Lighter orange
val CyberpunkStatusWarningDark = Color(0xFFDD8800)   // Darker orange

// Info
val CyberpunkStatusInfo = Color(0xFF00D9FF)          // Cyan
val CyberpunkStatusInfoLight = Color(0xFF33E9FF)     // Lighter cyan
val CyberpunkStatusInfoDark = Color(0xFF00A8CC)      // Darker cyan

// ==================== Border Colors ====================
val CyberpunkBorderPrimary = Color(0xFF00D9FF)       // Cyan borders
val CyberpunkBorderSecondary = Color(0xFFB400FF)     // Purple borders
val CyberpunkBorderTertiary = Color(0xFF3E4556)      // Subtle dark borders
val CyberpunkBorderAccent = Color(0xFFFF006E)        // Magenta accent borders
val CyberpunkBorderSubtle = Color(0xFF2C3447)        // Very subtle borders
val CyberpunkBorderActive = Color(0xFF00D9FF)        // Active/focused state borders
val CyberpunkBorderInactive = Color(0xFF1A2438)      // Inactive state borders

// ==================== Gradient Base Colors ====================
val CyberpunkGradientStart = Color(0xFF00D9FF)       // Cyan
val CyberpunkGradientMiddle = Color(0xFFB400FF)      // Purple
val CyberpunkGradientEnd = Color(0xFFFF006E)         // Magenta

// ==================== Semantic Colors ====================
val CyberpunkDanger = Color(0xFFFF0055)              // Danger/Critical
val CyberpunkWarning = Color(0xFFFFAA00)             // Warning
val CyberpunkSuccess = Color(0xFF00D966)             // Success
val CyberpunkDisabled = Color(0xFF3E4556)            // Disabled state
val CyberpunkFocus = Color(0xFF00D9FF)               // Focus indicator

// ==================== Transparency Variants ====================
val CyberpunkNeonCyanTransparent = CyberpunkNeonCyan.copy(alpha = 0.5f)
val CyberpunkNeonMagentaTransparent = CyberpunkNeonMagenta.copy(alpha = 0.5f)
val CyberpunkNeonPurpleTransparent = CyberpunkNeonPurple.copy(alpha = 0.5f)
