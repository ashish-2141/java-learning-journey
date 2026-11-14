#!/usr/bin/env bash
# Creates the java-learning-journey skeleton in the CURRENT folder.
# Usage:  bash bootstrap.sh
set -euo pipefail

dirs=(
  .github/workflows docs scripts data
  notes/templates notes/daily notes/assessments
  week-01-basics/src/com/example/week01/profile
  week-02-data-types/src/com/example/week02/result
  week-03-operators/src/com/example/week03/lab
  week-04-control-flow/src/com/example/week04/bank
  week-05-arrays-strings/src/com/example/week05/textanalyzer
  week-06-classes-objects/src/com/example/week06/management
  week-07-immutability-memory/src/com/example/week07
  week-07-immutability-memory/diagrams
  week-08-exceptions/src/com/example/week08/bank
  week-09-collections/src/com/example/week09/records
  week-10-generics/src/com/example/week10/repository
  week-11-input-output/src/com/example/week11/filemanager
  week-12-integrated-project/src/com/example/workflow/model
  week-12-integrated-project/src/com/example/workflow/repository
  week-12-integrated-project/src/com/example/workflow/exception
  week-12-integrated-project/src/com/example/workflow/service
  week-12-integrated-project/src/com/example/workflow/storage
  week-12-integrated-project/src/com/example/workflow/ui
)

for d in "${dirs[@]}"; do
  mkdir -p "$d"
  touch "$d/.gitkeep"   # keeps empty folders in Git
done

cat > .gitignore <<'EOF'
# ---- Compiled output (javac -d out/..., IntelliJ out/, CI) ----
out/
bin/
build/
build-ci/
target/
*.class

# ---- From GitHub's Java.gitignore template ----
*.log
*.ctxt
.mtj.tmp/
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar
hs_err_pid*
replay_pid*

# ---- IntelliJ IDEA (project settings are re-created locally; see docs/setup.md) ----
.idea/
*.iml
*.iws
*.ipr

# ---- Other editors ----
.vscode/
.classpath
.project
.settings/

# ---- Operating-system files ----
.DS_Store
._*
Thumbs.db
ehthumbs.db
Desktop.ini

# ---- Data written by Week 11 / Week 12 programs ----
data/*
!data/.gitkeep
*.ser
*.dat
sources.txt
EOF

cat > .gitattributes <<'EOF'
# Normalise line endings: LF in the repository, native endings in your working folder.
* text=auto

*.java  text diff=java
*.md    text
*.yml   text
*.sh    text eol=lf
*.ps1   text eol=crlf

*.png   binary
*.jpg   binary
*.pdf   binary
*.ser   binary
*.dat   binary
EOF

cat > .editorconfig <<'EOF'
root = true

[*]
charset = utf-8
insert_final_newline = true
trim_trailing_whitespace = true
indent_style = space
indent_size = 4

[*.{yml,yaml}]
indent_size = 2

[*.md]
trim_trailing_whitespace = false
EOF

echo "Skeleton created. Next: paste README.md, docs/, notes/, LICENSE, CI and Java files, then run 'git init'."
